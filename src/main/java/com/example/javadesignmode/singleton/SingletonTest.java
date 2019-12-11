package com.example.javadesignmode.singleton;

public class SingletonTest {

	public SingletonTest(){
		
	}
	
	private static SingletonTest instance;
	
	public static SingletonTest getInstance(){
		if(instance==null){
			synchronized(SingletonTest.class){
				instance = new SingletonTest();
			}
		}
		
		return instance;
	}
}
