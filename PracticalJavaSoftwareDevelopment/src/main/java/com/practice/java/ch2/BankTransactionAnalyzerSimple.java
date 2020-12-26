package com.practice.java.ch2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        final String projectName = "PracticalJavaSoftwareDevelopment";
        final String finalName = "bank-data-simple.csv";
        final Path path = Paths.get(projectName,"src", "main", "resources", finalName);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line : lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The total for all transactions is " + total);

    }
}
