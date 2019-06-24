package com.example.demo.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeacherDAO;

import com.example.demo.entity.TeacherDetails;
@Service
public class TeacherBO {

	@Autowired
	TeacherDAO dao;
	
	public void addTeacher(TeacherDetails b2) {
		dao.save(b2);
	}

	public TeacherDetails findById(int i) {

		Optional<TeacherDetails> b = dao.findById(1l);
		return b.get();

	}
	
	
}
