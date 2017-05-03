package com.guffy.spring;

public class EmailNotifyService implements NotifyService {

	@Override
	public void notifyService() {

		System.out.println("From the Email ");
	}

}
