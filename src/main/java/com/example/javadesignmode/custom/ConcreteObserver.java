package com.example.javadesignmode.custom;
/**
 * ����۲���--ʵ����
 * @author fuxiaorong-len
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("I had updated!");
	}
}
