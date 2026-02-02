package com.akhil.student.repository;


import com.akhil.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    // Custom Method :Spring parses "findByName" -> SELECT * FROM student WHERE name = ?

    List<Student> findByName(String name);



}
