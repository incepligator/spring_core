package com.guffy.vo;

public class OrderVO {

	private String orderNumber;
	private Long productId;
	
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "OrderVO [orderNumber=" + orderNumber + ", productId=" + productId + "]";
	}
	

}
