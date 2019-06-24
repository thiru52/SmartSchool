package com.example.demo.vo;

import org.springframework.stereotype.Component;

@Component
public class SubjectVO {
	private String teachername;

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
		//System.out.println(teachername);
	}
	}
