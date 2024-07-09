package com.sparta.lh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 9, 1, 2, 3, 4, 5));
        System.out.println(list);

        List<Integer> newList = list.stream()
                .distinct()
                .map(n -> n * 2)
                .filter(n -> n > 5)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newList);


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
