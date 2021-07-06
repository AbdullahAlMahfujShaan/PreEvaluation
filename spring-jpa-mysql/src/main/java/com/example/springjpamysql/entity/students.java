package com.example.springjpamysql.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_TBL")

public class students {

    @Id
    @GeneratedValue
    private int reg_id;
    private int institution_id;
    private int student_id;
    private String first_name;
    private String last_name;
    private Date reg_date;
    private Date date_of_birth;
    private int age;
    private String gender;
    private int nid;
    private String occupation;
    private String present_address;
    private String permanent_address;
    private String street;
    private int post_office;
    private String upazila;
    private String district;
    private String division;
    private int contact_no;
    private String email;
    private int photo;
    private Date created_on;
    private String created_by;
    private String degree;
    private String institute;
    private int completion_year;
    private float grade;
}
