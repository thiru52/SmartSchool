package com.example.demo.vo;

import org.springframework.stereotype.Component;

@Component
public class TeacherVO {
	
		private String username;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public long getDcontact() {
			return dcontact;
		}
		public void setDcontact(long dcontact) {
			this.dcontact = dcontact;
		}
		private long  dcontact;
		

	}


