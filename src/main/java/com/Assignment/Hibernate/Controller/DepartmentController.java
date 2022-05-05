package com.Assignment.Hibernate.Controller;

import com.Assignment.Hibernate.Entity.Department;
import com.Assignment.Hibernate.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {
    @Autowired
    public DepartmentService departmentService;
    @GetMapping("/dept/fetch/all")
    public List<Department> getall(){
        return this.departmentService.getall();
    }

    @GetMapping("/dept/fetch/{deptId}")
    public Department getone(@PathVariable String deptId){
        return this.departmentService.getone(Long.parseLong(deptId));
    }

    @PostMapping("/dept/add")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @PutMapping("/dept/update")
    public Department updateDepartment(@RequestBody Department department){
        return this.departmentService.updateDepartment(department);
    }

}
