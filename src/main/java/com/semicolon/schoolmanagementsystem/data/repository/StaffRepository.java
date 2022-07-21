package com.semicolon.schoolmanagementsystem.data.repository;

import com.semicolon.schoolmanagementsystem.data.model.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staffs,Integer> {
}
