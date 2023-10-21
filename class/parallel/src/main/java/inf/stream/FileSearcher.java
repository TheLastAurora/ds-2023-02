package inf.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileSearcher {

    private final String[] fileExtensions = { ".java", ".class", ".war" };
    private final String parallelStreamArg = "-p";
    private static boolean parallelSearch = false;
    private static final Iterable<Path> systemRootDirs = FileSystems.getDefault().getRootDirectories();
    private static final String executionPath = System.getProperty("user.dir");
    private String searchPath;
    private String file;
    private List<Path> searchResults = new ArrayList<>();
    private boolean filesFound = false;

    public FileSearcher(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: fc <nome_classe> <dir> [-p]");
            return;
        } 
            
        this.searchPath = setAbsoluteSearchPath(args[1]);
        this.file = args[0];
        if (args.length == 3 && Arrays.asList(args).contains(parallelStreamArg)) {
            parallelSearch = true;
        }
        if (parallelSearch) {
            parallelListing(file);
        } else {
            sequentialListing(file);
        }
    }

    public void parallelListing(String fileToFind) {
        System.out.println("Buscando paralelamente...");
        List<Path> files = listFiles(searchPath);
        searchResults.addAll(files);
        files.parallelStream().forEach(path -> {
            if (path.getFileName().toString().contains(fileToFind)) {
                System.out.println("Found file: " + path);
                filesFound = true;
            }
        });
        if (!filesFound) {
            System.out.println("Nenhum arquivo encontrado.");
        }
    }

    public void sequentialListing(String fileToFind) {
        System.out.println("Buscando sequencialmente...");
        List<Path> files = listFiles(searchPath);
        searchResults.addAll(files);

        files.stream().forEach(path -> {
            if (path.getFileName().toString().contains(fileToFind)) {
                System.out.println("Arquivo encontrado: " + path);
                filesFound = true;
            }
        });
        if (!filesFound) {
            System.out.println("Nenhum arquivo encontrado.");
        }
    }

    public List<Path> listFiles(String searchPath) {
        List<Path> result = new ArrayList<>();
        try {
            File[] files = new File(searchPath).listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && hasValidExtension(file.getName())) {
                        result.add(file.toPath());
                    } else if (file.isDirectory()) {
                        result.addAll(listFiles(file.getAbsolutePath()));
                    }
                }
            }
        } catch (SecurityException e) {
            System.err.println("Falha ao listar arquivos: " + e.getMessage());
        }
        return result;
    }

    public boolean hasValidExtension(String fileName) {
        for (String ext : fileExtensions) {
            if (fileName.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }

    public String setAbsoluteSearchPath(String searchPath) {
        return executionPath + searchPath;
    }

    public String getSearchPath() {
        return searchPath;
    }

    public boolean areFilesFound() {
        return filesFound;
    }
}
