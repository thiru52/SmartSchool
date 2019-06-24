package com.example.demo.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.demo.entity.TeacherDetails;

@Component
public class SubjectDTO {

	private long SubjectCode;

	private String SubjectName;

	private Date CreatedDate;

	private Date updatedDate;

	public String toString() {
		return "SubjectDetails [SubjectCode=" + SubjectCode + ", SubjectName=" + SubjectName + ", CreatedDate="
				+ CreatedDate + ", updatedDate=" + updatedDate + "]";
	}

	public long getSubjectCode() {
		return SubjectCode;
	}

	public void setSubjectCode(long subjectCode) {
		SubjectCode = subjectCode;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	private TeacherDetails teacher = null;

	public TeacherDetails getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDetails teacher) {
		this.teacher = teacher;
	}
}
