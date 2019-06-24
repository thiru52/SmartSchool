package com.example.demo.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SubjectDAO;
import com.example.demo.entity.SubjectDetails;
@Service
public class SubjectBO {
	
	@Autowired
	SubjectDAO dao;

	

	public void addSubject(SubjectDetails b1) {
		// TODO Auto-generated method stub
		dao.save(b1);
	}
	public SubjectDetails findById(int i) {

		Optional<SubjectDetails> b = dao.findById(1l);
		return b.get();

	}
	
}
