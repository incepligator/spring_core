package com.guffy.vo;

public class ProductVO {

	private Long Id;
	
	private String productName;
	private String manufacturer;
	private String version;
	private String description;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProductVO [Id=" + Id + ", productName=" + productName + ", manufacturer=" + manufacturer + ", version="
				+ version + ", description=" + description + "]";
	}
	

}
