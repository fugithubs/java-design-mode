package com.example.javadesignmode.simpleFactory;

public class StaticFactoryModel {

	public static ISender getMailSender(){
		return new MailSender();
	}
	
	public static ISender getSmsSender(){
		return new SmsSender();
	}

}
