package com.cydeo.entity;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "studentFirstName")
        private String firstName;
        @Column(name = "studentLastName")
        private String lastName;
        private String email;

        @Transient  // bu anotaion kullaninca table ekleme yapmiyor
        private String city;

}

