package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String fileName = "TextFile.txt";

        ArrayList<String> lines = new ArrayList<>();
        boolean areMere = false;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);

                if (line.toLowerCase().contains("mere")) {
                    areMere = true;
                }
            }

            bufferedReader.close();

            Collections.sort(lines);

            for (String sortedLine : lines) {
                System.out.println(sortedLine);
            }


            if (areMere) {
                System.out.println("Contine cuvantul 'MERE'");
            } else {
                System.out.println("Nu contine cuvantul 'MERE'");
            }

        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierului: " + e.getMessage());
        }
    }
}