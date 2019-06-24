package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.bo.SubjectBO;
import com.example.demo.entity.SubjectDetails;
import com.example.demo.entity.TeacherDetails;

@SpringBootApplication
@EnableJpaAuditing
public class SchoolApplication {

	public static void main(String[] args) {
		ApplicationContext t = SpringApplication.run(SchoolApplication.class, args);

		/*
		 * StudentDetails b = new StudentDetails(); b.setStudentName("thiru");
		 * b.setStudentClass("sslc"); b.setStudentcontactNumber(9944);
		 * b.setParentcontactNumber(9944); StudentBO bo = t.getBean(StudentBO.class);
		 * bo.addStudent(b); bo.findById(1); System.out.println(bo.findById(1));
		 * 
		 * System.out.println(
		 * "----------------------------------------------------------"); SubjectDetails
		 * b1 = new SubjectDetails();
		 * 
		 * b1.setSubjectName("thiru"); // b1.setSubjectCode(6504); commented this code
		 * since we are trying to add a new // subject
		 * 
		 * SubjectBO bo1 = t.getBean(SubjectBO.class); bo1.addSubject(b1);
		 * bo1.findById(1); System.out.println(bo.findById(1));
		 * 
		 * System.out.println(
		 * "----------------------------------------------------------"); TeacherDetails
		 * t1 = new TeacherDetails(); t1.setTeacherName("thiru");
		 * t1.setTeacherContactNumber(9944);
		 * 
		 * TeacherBO t12 = t.getBean(TeacherBO.class); t12.addTeacher(t1);
		 * t12.findById(1); System.out.println(bo1.findById(1));
		 */
		
	
		
		/*this first type this addds two subjects and one teacher by teacher bo
		 * SubjectDetails s = new SubjectDetails(); s.setSubjectName("maths");
		 * 
		 * SubjectDetails s1 = new SubjectDetails(); s1.setSubjectName("science");
		 * 
		 * 
		 * 
		 * TeacherDetails t1 = new TeacherDetails(); t1.setTeacherName("karthi");
		 * t1.setTeacherContactNumber(9944); s.setTeacher(t1); s1.setTeacher(t1);
		 * 
		 * List<SubjectDetails> li = new ArrayList<SubjectDetails>(); li.add(s);
		 * li.add(s1); t1.setSubjects(li);
		 * 
		 * TeacherBO t12 = t.getBean(TeacherBO.class); t12.addTeacher(t1);
		 */
		
		
		
		//this is second type which adds two subjects for existing teacher
		/*
		 * SubjectDetails s = new SubjectDetails(); s.setSubjectName("english");
		 * 
		 * SubjectDetails s1 = new SubjectDetails(); s1.setSubjectName("tamil");
		 * 
		 * TeacherDetails t1= new TeacherDetails(); t1.setTeacherID(2);
		 * 
		 * s.setTeacher(t1); s1.setTeacher(t1);
		 * 
		 * List<SubjectDetails> li = new ArrayList<SubjectDetails>(); li.add(s);
		 * li.add(s1); t1.setSubjects(li); SubjectBO bo = t.getBean(SubjectBO.class);
		 * bo.addSubject(s); bo.addSubject(s1);
		 * 
		 */

	}

}
