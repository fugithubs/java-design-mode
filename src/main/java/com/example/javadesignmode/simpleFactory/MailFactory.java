package com.example.javadesignmode.simpleFactory;

public class MailFactory implements IProvider {

	@Override
	public ISender produce() {
		return new MailSender();
	}

	

}
