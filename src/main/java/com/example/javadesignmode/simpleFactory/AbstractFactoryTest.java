package com.example.javadesignmode.simpleFactory;

public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ISender sender=new MailFactory().produce();
		sender.send();
	}

}
