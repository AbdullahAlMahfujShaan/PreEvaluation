package com.example.springjpamysql.controller;

import com.example.springjpamysql.entity.Student;
import com.example.springjpamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")

    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }


    @PostMapping("/addStudents")
    public List<Student> addStudent(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }


}
