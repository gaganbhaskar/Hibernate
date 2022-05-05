package com.Assignment.Hibernate.Services;


import com.Assignment.Hibernate.Entity.Employee;

import com.Assignment.Hibernate.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService{

    public List<Employee> getall();
    public Employee getone(Long empId) ;
    public Employee addemployee(Employee employee);
    public Employee updateemployee(Employee employee);

    }
