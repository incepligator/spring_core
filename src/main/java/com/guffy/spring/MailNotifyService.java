package com.guffy.spring;

import org.springframework.stereotype.Service;

@Service("mailService")
public class MailNotifyService implements NotifyService {

	@Override
	public void notifyService() {

		System.out.println("From the mail ");
	}

}
