package com.csv;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileReader;
import com.opencsv.CSVReader;
import java.io.FileWriter;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CSVHandler {
    public static void treatCSV(String input) throws CsvValidationException {
        try (CSVReader reader = new CSVReader(new FileReader(input))) {
            List<String[]> data = new ArrayList<>();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                String[] line = CSVProcessor.processCSVLine(nextLine);
                data.add(line);
            }

            try (CSVWriter writer = new CSVWriter(new FileWriter(input))) {
                writer.writeAll(data);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("CSV saved successfully!");
    }
}