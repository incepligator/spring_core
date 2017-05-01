package com.guffy.spring;

import com.guffy.vo.ProductVO;

public class OrderServiceImpl extends AbstractService implements OrderService {

	public void initialize() {

		System.out.println("inside init");
		this.setDefaultVersion("1.0");

	}

	public void cleanUp() {

		System.out.println("inside cleanup()");
		this.setDefaultVersion(null);

	}

	public ProductVO createOrder(ProductVO vo) {

		vo.setVersion(getDefaultVersion());
		vo.setManufacturer(this.getManf());
		vo.setId(super.getIdGenerator().generateId());
		return vo;
	}

}
