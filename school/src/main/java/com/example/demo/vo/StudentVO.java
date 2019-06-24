package com.example.demo.vo;

import org.springframework.stereotype.Component;

@Component
public class StudentVO {
	private String username;
	private String classnm;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassnm() {
		return classnm;
	}

	public void setClassnm(String classnm) {
		this.classnm = classnm;
	}

	private String email;
	private long contact;

	private long Parentcontact;

	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", classnm=" + classnm + ", email=" + email + ", contact="
				+ contact + ", Parentcontact=" + Parentcontact + "]";
	}

	public long getParentcontact() {
		return Parentcontact;
	}

	public void setParentcontact(long parentcontact) {
		Parentcontact = parentcontact;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

}

