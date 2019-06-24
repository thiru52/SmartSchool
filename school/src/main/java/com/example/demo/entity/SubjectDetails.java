package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@EntityListeners(AuditingEntityListener.class)

@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class SubjectDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long SubjectCode;
	
	@NotBlank
	private String SubjectName;


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
		return "SubjectDetails [SubjectCode=" + SubjectCode + ", SubjectName=" + SubjectName  + ", CreatedDate=" + CreatedDate + ", updatedDate=" + updatedDate + "]";
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
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn( name = "teacher_id",nullable = false,referencedColumnName = "TeacherID")
	private TeacherDetails teacher=null;

	public TeacherDetails getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDetails teacher) {
		this.teacher = teacher;
	}
}
