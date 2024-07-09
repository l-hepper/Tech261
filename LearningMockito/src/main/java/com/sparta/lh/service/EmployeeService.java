package com.sparta.lh.service;

import com.sparta.lh.dao.EmployeeDAO;
import com.sparta.lh.dao.EmployeeDAO;
import com.sparta.lh.dto.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {

    private EmployeeDAO DAO;

    public EmployeeService(EmployeeDAO DAO) {
        this.DAO = DAO;
    }

    public EmployeeDAO getDAO() {
        return DAO;
    }

    public void setDAO(EmployeeDAO DAO) {
        this.DAO = DAO;
    }

    public boolean checkEmployeeExistsByID(String ID) {
        ResultSet result = DAO.getEmployeeByID(ID);
        return result != null;
    }

    public boolean addEmployee(Employee employee) {
        return DAO.insertEmployeeIntoDatabase(employee);
    }

    public boolean deleteEmployeeByID(String ID) {
        return DAO.deleteEmployeeFromDatabase(ID);
    }

    public boolean addListOfEmployees(ArrayList<Employee> employeeList) {
        boolean flag = true;
        for (Employee employee: employeeList) {
            if (DAO.insertEmployeeIntoDatabase(employee)) {
                flag = false;
            }
        }
        return flag;
    }



}
