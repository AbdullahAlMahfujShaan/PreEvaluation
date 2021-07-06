package com.example.springjpamysql.repository;

import com.example.springjpamysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


    Student findByNID(int nid);
}
