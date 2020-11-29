package com.prideuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prideuser.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
