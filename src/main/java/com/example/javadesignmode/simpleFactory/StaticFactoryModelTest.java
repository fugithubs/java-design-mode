package com.example.javadesignmode.simpleFactory;

public class StaticFactoryModelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticFactoryModel.getMailSender().send();
		StaticFactoryModel.getSmsSender().send();
	}

}
