package com.example.javadesignmode.simpleFactory;

public class MailSender implements ISender {

	@Override
	public void send() {
		System.out.println("mail sender......");
	}

}
