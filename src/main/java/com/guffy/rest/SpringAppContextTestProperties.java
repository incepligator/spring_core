package com.guffy.rest;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guffy.spring.OrderService;

import com.guffy.vo.ProductVO;

public class SpringAppContextTestProperties {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring2.xml");

		DBConnectionObject dbobj = context.getBean(DBConnectionObject.class);

		System.out.println(dbobj);

	}

/*	public static ProductVO createProductVO() {
		ProductVO result = new ProductVO();

		result.setId(new Long(1000));
		result.setProductName("Dell XPS");

		return result;

	}*/
}
