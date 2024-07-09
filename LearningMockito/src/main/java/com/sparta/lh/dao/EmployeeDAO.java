package com.sparta.lh.dao;

import com.sparta.lh.dto.Employee;

import java.sql.ResultSet;

public class EmployeeDAO {

    public ResultSet getEmployeeByID(String ID) {
        // some code goes here to get the employee from the database by ID
        return null;
    }

    public boolean insertEmployeeIntoDatabase(Employee employee) {
        return false;
    }


    public boolean deleteEmployeeFromDatabase(String id) {
        return false;
    }

    public ResultSet getEmployeesWithin1YearOfRetirement(String lastName) {
        // code here to get employees within 1 year of retirement
        return null;
    }
}
