package com.example.javadesignmode.simpleFactory;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		senderFactory f = new senderFactory();
		ISender send = f.send("m");
		send.send();
	}

}
