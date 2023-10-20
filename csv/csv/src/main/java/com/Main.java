package com;

import com.csv.CSVHandler;
import com.opencsv.exceptions.CsvValidationException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main file_name.csv");
            System.exit(1);
        }

        String inputFileName = args[0];
        try {
            CSVHandler.treatCSV(inputFileName);
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
    }
}