package com.example.springjpamysql.service;

import com.example.springjpamysql.entity.Student;
import com.example.springjpamysql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student)  {
        return repository.save(student);
    }
    public List<Student> saveStudents(List<Student> students)  {
        return repository.saveAll(students);
    }
}
