package com.example.demo.dto;

import java.util.List;



import org.springframework.stereotype.Component;

import com.example.demo.entity.SubjectDetails;

@Component
public class TeacherDTO {
	
	public long getTeacherID() {
		return TeacherID;
	}

	public void setTeacherID(long teacherID) {
		TeacherID = teacherID;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public long getTeacherContactNumber() {
		return TeacherContactNumber;
	}

	public void setTeacherContactNumber(long teacherContactNumber) {
		TeacherContactNumber = teacherContactNumber;
	}

	@Override
	public String toString() {
		return "TeacherDetails [TeacherID=" + TeacherID + ", TeacherName=" + TeacherName + ", TeacherContactNumber="
				+ TeacherContactNumber + "]";
	}

	private long TeacherID;
	
	private String TeacherName;
	
	
	private long TeacherContactNumber;
	
	private List<SubjectDetails> subjects=null;

	public List<SubjectDetails> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDetails> subjects) {
		this.subjects = subjects;
	}

	}


