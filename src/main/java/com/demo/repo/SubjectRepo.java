package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
