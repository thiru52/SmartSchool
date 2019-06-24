package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentDetails;
@Repository
public interface FetchDAO extends JpaRepository<StudentDetails,Long >{

	
}
