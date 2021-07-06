package com.example.springjpamysql.repository;

import com.example.springjpamysql.entity.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<students,Integer> {



}
