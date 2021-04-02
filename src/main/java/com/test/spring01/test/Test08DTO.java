package com.test.spring01.test;

public class Test08DTO {
	private String id;
	private String passwd;
	
	public Test08DTO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Test08DTO [id=" + id + ", passwd=" + passwd + "]";
	}
}