package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.StudentBO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentDetails;

@RestController
public class SchoolService {
	@Autowired
	StudentBO sb = null;

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public @ResponseBody StudentDTO addStudent(@RequestBody StudentDTO msg) {

		System.out.println("message:" + msg.getStudentName());
		System.out.println("Name:" + msg.getStudentId());
		StudentDetails l = new StudentDetails();
		l.setStudentName(msg.getStudentName());
		l.setStudentClass(msg.getStudentClass());
		l.setStudentId(msg.getStudentId());
		l.setStudentcontactNumber(msg.getStudentcontactNumber());
		l.setParentcontactNumber(msg.getParentcontactNumber());
		l.setCreatedDate(msg.getCreatedDate());
		l.setUpdatedDate(msg.getUpdatedDate());
		sb.addStudent(l);
		return msg;
	}

	@RequestMapping(value = "/fetchStudent", method = RequestMethod.POST)
	public @ResponseBody StudentDTO fetchStudent(@RequestBody String id) {

		System.out.println("ID:" + id);
		StudentDetails l = sb.findById(new Long(id));
		StudentDTO dto = new StudentDTO();
		dto.setCreatedDate(l.getCreatedDate());
		dto.setUpdatedDate(l.getUpdatedDate());
		dto.setStudentName(l.getStudentName());
		dto.setStudentClass(l.getStudentClass());
		dto.setParentcontactNumber(l.getParentcontactNumber());
		dto.setStudentcontactNumber(l.getStudentcontactNumber());
	
		return dto;
	}

}
