package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping
public interface StudentRepository extends JpaRepository<Student, Long> {

    // SELECT * FROM student WHERE email =
    @Query("Select s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
