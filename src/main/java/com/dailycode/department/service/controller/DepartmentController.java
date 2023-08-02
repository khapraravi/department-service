package com.dailycode.department.service.controller;

import com.dailycode.department.service.entity.Department;
import com.dailycode.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //save department
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside post mapping save department");
        return departmentService.saveDepartment(department);
    }

    //get department
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        log.info("this is get methpod for departemnt");
        return departmentService.getDepartment(id);
    }





}
