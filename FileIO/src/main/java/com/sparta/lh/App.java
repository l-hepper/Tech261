package com.sparta.lh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        int duplicates = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/employees-corrupted.csv"))) {

            reader.readLine(); // skip the first line

            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
                String[] array = line.split(",");
                if (mySet.contains(line)) {
                    duplicates++;
                    System.out.println("Duplicate found: ");
                    System.out.println(line);
                    System.out.println(mySet.remove(line));
                } else {
                    mySet.add(line);
                }
            }
            System.out.println("Total records: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This is the final block.");
        }
        System.out.println("Size of set: " + mySet.size());
        System.out.println("Duplicates: " + duplicates);
    }

    private static int extractedMethod() {
        List<String> employeeList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/employees-corrupted.csv"))) {

            reader.readLine(); // skip the first line

            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                employeeList.add(line);
                count++;
            }
            System.out.println("Total records: " + count);
            return 1;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This is the final block.");
        }

        System.out.println("This is the end of the method.");

        return 0;
    }
}
