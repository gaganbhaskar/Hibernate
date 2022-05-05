package com.Assignment.Hibernate.Services;

import com.Assignment.Hibernate.Entity.Department;
import com.Assignment.Hibernate.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getall() {
        return departmentRepository.findAll();
    }


    public Department getone(Long deptId) {
        return departmentRepository.findById(deptId).get();
    }


    public Department addDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }


    public Department updateDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }
}
