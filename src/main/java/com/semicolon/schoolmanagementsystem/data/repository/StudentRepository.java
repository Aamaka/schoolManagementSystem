package com.semicolon.schoolmanagementsystem.data.repository;

import com.semicolon.schoolmanagementsystem.data.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
