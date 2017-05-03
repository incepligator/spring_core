package com.guffy.rest;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guffy.spring.OrderService;
import com.guffy.spring.OrderServiceImpl;
import com.guffy.vo.ProductVO;

public class SpringAppContextTestMultipleXML {

	public static void main(String[] args) {

		String[] xml = { "SampleSpring2.xml" };

		// for the import of the one to another xml import
		// String[] xml = { "SampleSpring1.xml", "SampleSpring2.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(xml);

		// single ton scope in xml
		OrderServiceImpl os = context.getBean("os4", OrderServiceImpl.class);
		os.setManf("My manufacture");
		ProductVO result = os.createOrder(createProductVO());
		System.out.println(result);

		OrderService os2 = context.getBean("os4", OrderService.class);
		ProductVO result2 = os2.createOrder(createProductVO());
		System.out.println(result2);

	}

	public static ProductVO createProductVO() {
		ProductVO result = new ProductVO();

		result.setId(new Long(1000));
		result.setProductName("Dell XPS");

		return result;

	}
}
