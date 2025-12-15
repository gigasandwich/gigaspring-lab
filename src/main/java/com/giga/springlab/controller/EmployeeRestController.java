package com.giga.springlab.controller;

import com.giga.spring.annotation.controller.Controller;
import com.giga.spring.annotation.controller.PathVariable;
import com.giga.spring.annotation.controller.RestController;
import com.giga.spring.annotation.http.DoGet;
import com.giga.springlab.model.Department;
import com.giga.springlab.model.Employee;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeRestController {
    @DoGet(path = "/rest/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E1", new Department("D1"), null, null, null));
        employees.add(new Employee("E2", new Department("D1"), null, null, null));
        employees.add(new Employee("E3", new Department("D2"), null, null, null));
        return employees;
    }

    @DoGet(path = "/rest/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        List<Employee> employees = getEmployees();
        return employees.get(id);
    }

    @DoGet(path = "/rest/employees/{id}/name")
    public String getEmployeeName(@PathVariable("id") int id) {
        List<Employee> employees = getEmployees();
        return employees.get(id).getName();
    }
}
