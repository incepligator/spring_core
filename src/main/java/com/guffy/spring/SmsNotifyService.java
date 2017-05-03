package com.guffy.spring;

public class SmsNotifyService implements NotifyService {

	@Override
	public void notifyService() {

		System.out.println("From the SMS ");
	}

}
