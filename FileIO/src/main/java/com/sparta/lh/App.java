package com.sparta.lh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

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
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String employee : employeeList) {
            System.out.println(employee);
        }
    }
}
