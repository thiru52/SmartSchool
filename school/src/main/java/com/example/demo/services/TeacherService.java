package com.example.demo.services;


import org.springframework.stereotype.Service;

import com.example.demo.bo.TeacherBO;
import com.example.demo.vo.TeacherVO;
@Service
public class TeacherService {
	public void addTeacher(TeacherVO vo )
	{
		TeacherBO bo = new TeacherBO();
		//bo.addTeacher(vo);
	}
}
