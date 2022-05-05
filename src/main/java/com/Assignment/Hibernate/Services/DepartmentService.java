package com.Assignment.Hibernate.Services;

import com.Assignment.Hibernate.Entity.Department;
import com.Assignment.Hibernate.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    public List<Department> getall();
    public Department getone(Long deptId) ;
    public Department addDepartment(Department department);
    public Department updateDepartment(Department department);
}
