package com.guffy.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.guffy.spring.NotifyService;
import com.guffy.vo.Vendors;

public class ProductUtil {

	private List<Vendors> vendors;

	private Set<String> products;

	private Map<Vendors, String> vendorProductMap;

	private List<NotifyService> notifyServices;

	public List<NotifyService> getNotifyServices() {
		return notifyServices;
	}

	public void setNotifyServices(List<NotifyService> notifyServices) {
		this.notifyServices = notifyServices;
	}

	public Map<Vendors, String> getVendorProductMap() {
		return vendorProductMap;
	}

	public void setVendorProductMap(Map<Vendors, String> vendorProductMap) {
		this.vendorProductMap = vendorProductMap;
	}

	public List<Vendors> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendors> vendors) {
		this.vendors = vendors;
	}

	public Set<String> getProducts() {
		return products;
	}

	public void setProducts(Set<String> products) {
		this.products = products;
	}

	public String toString() {
		return "ProductUtil [vendors=" + vendors + ", products=" + products + ", vendorProductMap=" + vendorProductMap
				+ ", notifyServices=" + notifyServices + "]";
	}

}
