package com.csv;
public class CSVProcessor {
    public static String[] processCSVLine(String[] inputLine) {
        String[] outputLine = new String[inputLine.length + 1];
        double sum = 0.0;

        for (int i = 0; i < inputLine.length; i++) {
            try {
                double value = Double.parseDouble(inputLine[i]);
                sum += value;
            } catch (NumberFormatException e) {
                outputLine[i] = inputLine[i];
            }
        }

        outputLine[inputLine.length] = Double.toString(sum);
        return outputLine;
    }
}
