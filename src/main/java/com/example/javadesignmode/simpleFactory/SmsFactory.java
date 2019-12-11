package com.example.javadesignmode.simpleFactory;

public class SmsFactory implements IProvider {

	@Override
	public ISender produce() {
		return new SmsSender();
	}

}
