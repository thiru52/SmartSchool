package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SubjectDetails;
@Repository
public interface SubjectDAO extends JpaRepository<SubjectDetails,Long >{

}
