package com.mahfujshaan.asimpleuserregistration.entity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;




@Entity
@IdClass(User.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "USER_TBL")


public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @NotNull
    private int institution_id;

    @Id
    @NotNull
    private int student_id;

    @NotNull
    private String firstname;

    @NotNull
    private String last_name;


    private Date reg_date;

    @NotNull
    private Date date_of_birth;

    @NotNull
    private int age;


    private String gender;

    @Id
    @NotNull
    private int nid;


    private String occupation;
    private String present_address;
    private String permanent_address;
    private String street;
    private int post_office;
    private String upazila;
    private String district;
    private String division;

    @NotNull
    private int contact_no;


    private String email;

    @Lob
   private Blob photo;

    private Date created_on;
    private String created_by;
    private String degree;
    private String institute;
    private int completion_year;
    private float grade;


}
