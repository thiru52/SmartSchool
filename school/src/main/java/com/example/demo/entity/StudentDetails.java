package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)

@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class StudentDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long StudentId;
	@NotBlank
	private String StudentName;
	@NotBlank
	private String StudentClass;
	@NotNull
	private long StudentcontactNumber;
	@NotNull
	private long ParentcontactNumber;
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date CreatedDate;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedDate;

	@Override
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
