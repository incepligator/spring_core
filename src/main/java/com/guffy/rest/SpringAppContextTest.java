package com.guffy.rest;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guffy.spring.OrderService;

import com.guffy.vo.ProductVO;

public class SpringAppContextTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");

		OrderService os = context.getBean("os2", OrderService.class);
		ProductVO result = os.createOrder(createProductVO());
		System.out.println(result);

		OrderService os2 = context.getBean("os3", OrderService.class);
		ProductVO result2 = os2.createOrder(createProductVO());
		System.out.println(result2);

		OrderService os1 = context.getBean("os1", OrderService.class);
		ProductVO result1 = os1.createOrder(createProductVO());
		System.out.println(result1);

	}

	public static ProductVO createProductVO() {
		ProductVO result = new ProductVO();

		result.setId(new Long(1000));
		result.setProductName("Dell XPS");

		return result;

	}
}
