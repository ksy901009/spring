package com.test.spring01.member.model.dto;

public class MemberDTO {
	private String id;
    private String passwd;
    private String name;
    private String email;
    private String regi_date;
    
    public MemberDTO() {
    	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegi_date() {
		return regi_date;
	}

	public void setRegi_date(String regi_date) {
		this.regi_date = regi_date;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + ", regi_date="
				+ regi_date + "]";
	}
}