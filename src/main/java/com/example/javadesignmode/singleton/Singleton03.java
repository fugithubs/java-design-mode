package com.example.javadesignmode.singleton;
/**
	线程安全，但效率非常低，在一个时候只有一个线程能访问，同时返回一个对象

 */
public class Singleton03 {

	private Singleton03(){
		
	}
	private static Singleton03 instance;
	public static synchronized Singleton03 getInstance(){
		if(instance==null){
			instance=new Singleton03();
		}
		return instance;
	}
}
