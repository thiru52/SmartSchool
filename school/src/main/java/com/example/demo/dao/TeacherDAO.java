package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TeacherDetails;
@Repository
public interface TeacherDAO extends JpaRepository<TeacherDetails,Long > {

	

}
