package com.Assignment.Hibernate.Controller;

import com.Assignment.Hibernate.Entity.Employee;


import com.Assignment.Hibernate.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/emp/fetch/all")
    public List<Employee> getall() {
        return this.employeeService.getall();
    }

    @GetMapping("/emp/fetch/{empid}")
    public Employee getone(@PathVariable String empid) {
        return this.employeeService.getone(Long.parseLong(empid));
    }

    @PostMapping("/emp/add")
    public Employee addemployee(@RequestBody Employee employee) {
        return this.employeeService.addemployee(employee);
    }

    @PutMapping("/emp/update")
    public Employee updateemployee(@RequestBody Employee employee) {
        this.employeeService.updateemployee(employee);
        return employee;
    }
}