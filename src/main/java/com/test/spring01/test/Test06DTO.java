package com.test.spring01.test;

public class Test06DTO {
	private String productGubun;
	private String productName;
	private int productPrice;
	private double productPromotion;
	private String manufacturer;
	private int productResultPrice;
	
	public Test06DTO() {
		
	}
	
	public void productResultPrice() {
		double productResultPrice_ = productPrice - productPrice * (productPromotion / 100);
		productResultPrice = (int) productResultPrice_;
	}

	public String getProductGubun() {
		return productGubun;
	}

	public void setProductGubun(String productGubun) {
		this.productGubun = productGubun;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public double getProductPromotion() {
		return productPromotion;
	}

	public void setProductPromotion(double productPromotion) {
		this.productPromotion = productPromotion;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getProductResultPrice() {
		return productResultPrice;
	}

	public void setProductResultPrice(int productResultPrice) {
		this.productResultPrice = productResultPrice;
	}

	@Override
	public String toString() {
		return "Test06DTO [productGubun=" + productGubun + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productPromotion=" + productPromotion + ", manufacturer=" + manufacturer
				+ ", productResultPrice=" + productResultPrice + "]";
	}
}