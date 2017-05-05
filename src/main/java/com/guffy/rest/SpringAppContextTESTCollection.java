package com.guffy.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guffy.spring.NotifyService;
import com.guffy.vo.Vendors;

public class SpringAppContextTESTCollection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring2.xml");

		ProductUtil productutil = context.getBean(ProductUtil.class);

		List<Vendors> vendors = productutil.getVendors();

		System.out.println(vendors);

		Set<String> products = productutil.getProducts();
		System.out.println(products);

		Map<Vendors, String> vendorProductMap = productutil.getVendorProductMap();
		System.out.println(vendorProductMap);

		List<NotifyService> notifyservices = productutil.getNotifyServices();

		for (NotifyService ns : notifyservices) {

			ns.notifyService();
		}

	}

	/*
	 * public static ProductVO createProductVO() { ProductVO result = new
	 * ProductVO();
	 * 
	 * result.setId(new Long(1000)); result.setProductName("Dell XPS");
	 * 
	 * return result;
	 * 
	 * }
	 */
}
