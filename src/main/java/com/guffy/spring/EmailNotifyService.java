package com.guffy.spring;

import org.springframework.stereotype.Service;

public class EmailNotifyService implements NotifyService {

	@Override
	public void notifyService() {

		System.out.println("From the mail ");
	}

}
