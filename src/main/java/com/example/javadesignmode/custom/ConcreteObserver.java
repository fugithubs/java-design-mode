package com.example.javadesignmode.custom;
/**
 * 具体观察者--实现类
 * @author fuxiaorong-len
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("I had updated!");
	}
}
