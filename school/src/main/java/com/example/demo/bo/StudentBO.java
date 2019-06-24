package com.example.demo.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.StudentDetails;

@Service
public class StudentBO {
	
	@Autowired
	StudentDAO dao;

	public void addStudent(StudentDetails b2) {
		dao.save(b2);
	}

	public StudentDetails findById(Long long1) {

		Optional<StudentDetails> b = dao.findById(1l);
		return b.get();

	}
}
