package com.sparta.lh;

import java.time.LocalDate;
import java.util.Objects;


// This is a traditional DTO
public class EmployeeDTO {

    // should be final because the data once initialised should not change.
    final private String name;
    final private Integer salary; // good to use reference types for DTO because it increases functionality?
    final private LocalDate dob;

    public EmployeeDTO(String name, Integer salary, LocalDate dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && Objects.equals(dob, that.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, dob);
    }
}
