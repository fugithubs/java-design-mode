package com.example.javadesignmode.simpleFactory;

public class senderFactory {

	public ISender send(String type){
		if(type=="m"){
			return new MailSender();
		}else if(type=="s"){
			return new SmsSender();
		}else {
			System.out.println("please send params......");
			return null;
		}
	}
}
