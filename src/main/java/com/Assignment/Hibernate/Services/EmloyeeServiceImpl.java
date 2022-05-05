package com.Assignment.Hibernate.Services;

import com.Assignment.Hibernate.Entity.Employee;
import com.Assignment.Hibernate.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmloyeeServiceImpl implements EmployeeService{
    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> getall() {
        return employeeRepository.findAll();
    }



    public Employee getone(Long empId) {
        return employeeRepository.findById(empId).get();
    }

    public Employee addemployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public Employee updateemployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
}
