package com.example.demo.dto;

import java.util.Date;


import org.springframework.stereotype.Component;

@Component
public class StudentDTO {
	private long StudentId;

	private String StudentName;
	
	private String StudentClass;
	
	private long StudentcontactNumber;
	
	private long ParentcontactNumber;
	
	private Date CreatedDate;

	
	private Date updatedDate;

	
	public String toString() {
		return "StudentDetails [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentClass="
				+ StudentClass + ", StudentcontactNumber=" + StudentcontactNumber + ", ParentcontactNumber="
				+ ParentcontactNumber + ", CreatedDate=" + CreatedDate + ", updatedDate=" + updatedDate + "]";
	}

	public long getStudentId() {
		return StudentId;
	}

	public void setStudentId(long studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentClass() {
		return StudentClass;
	}

	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}

	public long getStudentcontactNumber() {
		return StudentcontactNumber;
	}

	public void setStudentcontactNumber(long studentcontactNumber) {
		StudentcontactNumber = studentcontactNumber;
	}

	public long getParentcontactNumber() {
		return ParentcontactNumber;
	}

	public void setParentcontactNumber(long parentcontactNumber) {
		ParentcontactNumber = parentcontactNumber;
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

}

