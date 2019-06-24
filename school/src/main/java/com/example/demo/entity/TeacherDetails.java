package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class TeacherDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long TeacherID;
	@NotBlank
	private String TeacherName;
	
	@NotNull
	private long TeacherContactNumber;
	@OneToMany(fetch=FetchType.EAGER ,cascade=CascadeType.ALL,mappedBy = "teacher")
	private List<SubjectDetails> subjects=null;

	public List<SubjectDetails> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDetails> subjects) {
		this.subjects = subjects;
	}
}
