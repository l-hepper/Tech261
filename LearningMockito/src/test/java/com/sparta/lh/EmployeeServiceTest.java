package com.sparta.lh;

import com.sparta.lh.dao.EmployeeDAO;
import com.sparta.lh.dto.Employee;
import com.sparta.lh.service.EmployeeService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

public class EmployeeServiceTest {

    EmployeeDAO mockDAO = Mockito.mock(EmployeeDAO.class);
    EmployeeService employeeService = new EmployeeService(mockDAO);

    @Test
    public void testCheckEmployeeExistsByID() {
        ResultSet mockResultSet = Mockito.mock(ResultSet.class);
        Mockito.when(mockDAO.getEmployeeByID("123")).thenReturn(mockResultSet);
        boolean exists = employeeService.checkEmployeeExistsByID("123");
        Assertions.assertTrue(exists);

        Mockito.verify(mockDAO, Mockito.times(1)).getEmployeeByID("123");
    }

    @Test
    public void testCheckEmployeeExistsByIDReturnsFalse() {
        Mockito.when(mockDAO.getEmployeeByID("123")).thenReturn(null);
        boolean exists = employeeService.checkEmployeeExistsByID("123");
        Assertions.assertFalse(exists);
    }

    @Test
    public void testAddEmployee() {
        Mockito.when(mockDAO.insertEmployeeIntoDatabase(new Employee("123", "Johnny Lawrence"))).thenReturn(true);
        boolean success = employeeService.addEmployee(new Employee("123", "Johnny Lawrence"));
        Assertions.assertTrue(success);
    }

    @Test
    public void testAddEmployeeReturnsFalse() {
        Mockito.when(mockDAO.insertEmployeeIntoDatabase(new Employee("123", "Johnny Lawrence"))).thenReturn(false);
        boolean success = employeeService.addEmployee(new Employee("123", "Johnny Lawrence"));
        Assertions.assertFalse(success);
    }

    @Test
    public void testDeleteEmployeeByIDReturnsTrue() {
        Mockito.when(mockDAO.deleteEmployeeFromDatabase("123")).thenReturn(true);
        boolean success = employeeService.deleteEmployeeByID("123");
        Assertions.assertTrue(success);
    }

    @Test
    public void testDeleteEmployeeByIDReturnsFalse() {
        Mockito.when(mockDAO.deleteEmployeeFromDatabase("123")).thenReturn(false);
        boolean success = employeeService.deleteEmployeeByID("123");
        Assertions.assertFalse(success);
    }

    @Test
    public void testVerifyAddEmployee() {
        employeeService.addEmployee(new Employee("123", "Johnny Lawrence"));
        Mockito.verify(mockDAO, Mockito.times(1)).insertEmployeeIntoDatabase(new Employee("123", "Johnny Lawrence"));
    }
}
