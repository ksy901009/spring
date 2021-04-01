package com.test.spring01;

public class Test04DTO {
	private String name;
	private String gender;
	private String jumin;
	private int age;
	
	public Test04DTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test04DTO [name=" + name + ", gender=" + gender + ", jumin=" + jumin + ", age=" + age + "]";
	}
}