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

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentsById(int reg_id ){
        return repository.findById(reg_id).orElse(null);
    }
    public Student getStudentsByNID(int nid ){
        return repository.findByNID(nid);
    }

    public String deleteStudent(int reg_id){
        repository.deleteById(reg_id);
        return "Student Removed" +reg_id;
    }
public Student updateStudent(Student student){
        Student existingStudent = repository.findById(student.getReg_id()).orElse(null);
        existingStudent.setFirst_name(student.getFirst_name());
        //add other updating variables
    return repository.save(existingStudent);
}


}
