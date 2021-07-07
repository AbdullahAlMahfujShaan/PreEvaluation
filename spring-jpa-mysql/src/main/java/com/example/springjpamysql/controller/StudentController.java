package com.example.springjpamysql.controller;

import com.example.springjpamysql.entity.Student;
import com.example.springjpamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/api/v1/users")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }


    @GetMapping("/api/v1/users")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }

    @GetMapping("/api/v1/users/:id")
    public Student findStudentByRegId(@PathVariable int reg_id){
        return service.getStudentsById(reg_id);
    }

    @GetMapping("/api/v1/users/:nid")
    public Student findStudentByNID(@PathVariable int nid){
        return service.getStudentsByNID(nid);
    }

    @PutMapping("/api/v1/users/:id")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/api/v1/users/:id")
    public String deleteStudent(@PathVariable int reg_id){
        return service.deleteStudent(reg_id);
    }

    @DeleteMapping("/api/v1/users/")
    public String deleteAllStudent(){

    return service.deleteAllStudent();
    }
}