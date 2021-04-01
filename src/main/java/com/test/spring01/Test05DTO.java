package com.test.spring01;

public class Test05DTO {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sci;
	private int his;
	private int sum;
	private double avg;
	
	public Test05DTO() {
		
	}
	
	public void sum() {
		int sum = kor + eng + mat + sci + his;
		this.sum = sum;
	}
	
	public void avg() {
		double avg = sum / 5.0; 
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getHis() {
		return his;
	}

	public void setHis(int his) {
		this.his = his;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Test05DTO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", sci=" + sci + ", his="
				+ his + ", sum=" + sum + ", avg=" + avg + "]";
	}
}