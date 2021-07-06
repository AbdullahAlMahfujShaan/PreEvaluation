package com.example.springjpamysql.controller;

import com.example.springjpamysql.entity.Student;
import com.example.springjpamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
    private StudentService service;

public Student addStudent(@RequestBody Student student){
    
}
}
