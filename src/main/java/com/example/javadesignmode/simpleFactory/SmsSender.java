package com.example.javadesignmode.simpleFactory;

public class SmsSender implements ISender {

	@Override
	public void send() {
		System.out.println("sms sender......");
	}

}
