package com.semicolon.schoolmanagementsystem.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer id;
    @NonNull
    private String name;

    @NonNull
    private String grade;

    private double totalFees;
    @NonNull
    private double amountPaid;
    private String studentId;
    @NonNull
    private Gender gender;
    @NonNull
    private StudentType studentType;
    @NonNull
    private int age;
    @NonNull
    private String email;
    @NonNull
    private String stateOfOrigin;
    @NonNull
    private String dob;
    private String password;

//    @JoinColumn(name = "subject_id", referencedColumnName ="id",nullable = false)
//    @ManyToOne(optional = false, fetch = FetchType.EAGER)
//    private Subject subject;
}
