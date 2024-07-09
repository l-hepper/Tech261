package com.sparta.lh;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.io.

public class App {

    // Java sees the world as objects.
    // Three objects required for JDBC.
    // 1. Connection  2. Statements  3.Results
    // JDBC makes us of these three objects that other objects in the JDBC come from (these three are the base types)

    public static void main(String[] args) {


        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/mysql.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Connection is an interface - (so it's the same for whatever 'connection' you're using, local, hosted, etc)
        try (Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"))) {

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM northwind.customers WHERE ContactName = ?");// put in a ? for customer name
            // then when you use the prepared statemnt you provide the value


            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM customers WHERE first_name = 'John'");
            connection.close();



            preparedStatement.setString(1, "Ann Devon");

            Statement statement = connection.createStatement(); // connection creates the statement
            ResultSet resultSet = preparedStatement.executeQuery(); // preparedStatement.executeBatch();

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

                // how can i check to ensure statement and result are also closed?
        } catch (Exception e) {
            e.printStackTrace();
        }


        // three strings -- url to the database, username, password
        // SQLException - database eror has occured wehn trying to access
        // SQLTimeout exception -- we connected but then it broke
        // getConnection takes some parameterse and returns a 'connection' object to connect to your chosen database

        // the way the three base packages work
        // Connection -> Statement -> Result
        // Connection is created, connection creates the statement, then the statement gets the result

        // the way to handle

        // should the properties file be added to the .gitignore?  Yes


        // how can we protect against an SQL injection attack?
        // using preparedstatements (literally the class)


        // break the code down into three bits (the connection code is typically a singleton)
        // code to generate statements
        // code to retrieve data

        // HINT - have a look at how 'execute large update' and 'batches' work if you want a good way of adding/executing batches
        // to add large batches of data to the database

        // for the test - writing SQL answers - with some coding
    }
}
