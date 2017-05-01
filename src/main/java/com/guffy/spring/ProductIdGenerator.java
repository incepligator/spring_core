package com.guffy.spring;

public class ProductIdGenerator {

	public Long generateId() {

		return (long) (Math.random() * 1000);

	}
}
