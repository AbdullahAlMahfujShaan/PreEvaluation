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

    @PostMapping("/addStudent")

    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }


    @PostMapping("/addStudents")
    public List<Student> addStudent(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

@GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }
@GetMapping("/student/{reg_id}")
public Student findStudentByRegId(@PathVariable int reg_id){
        return service.getStudentsById(reg_id);
}
    @GetMapping("/student/{nid}")
    public Student findStudentByNID(@PathVariable int nid){
        return service.getStudentsByNID(nid);
    }



    @PutMapping("/updateStudent")

    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

@DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int reg_id){
        return service.deleteStudent(reg_id);
    }
}
