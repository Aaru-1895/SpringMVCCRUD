package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Subject;
import com.demo.repo.SubjectRepo;

@Service
public class SubjectService {

	@Autowired
	public SubjectRepo subjectRepo;
	
	
	public void saveSubject(Subject subject) {
		subjectRepo.save(subject);
	}
	
	public List<Subject> getAll(){
		return subjectRepo.findAll();
	}
	
}
