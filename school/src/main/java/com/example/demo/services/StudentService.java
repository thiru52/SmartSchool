package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.bo.StudentBO;
import com.example.demo.vo.StudentVO;
@Service
public class StudentService {
	
	
	public void addStudent(StudentVO vo )
	{
		StudentBO bo = new StudentBO();
		//bo.addStudent(vo);
		
	}

	public StudentVO fetchStudentByName(String name)
	{
		StudentBO bo = new StudentBO();
		//return (bo.fetchStudentByName(name));
		return null;
	}


}
