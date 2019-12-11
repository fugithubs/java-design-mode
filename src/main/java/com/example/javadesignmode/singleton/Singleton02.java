package com.example.javadesignmode.singleton;
/**
	饱汉方式的单例模式：有多个线程访问时不是安全的，返回的不是同一个对象

 */
public class Singleton02 {

	private Singleton02(){
		
	}
	private static Singleton02 instance;
	public static Singleton02 getInstance(){
		if(instance==null){
			instance=new Singleton02();
		}
		return instance;
	}
}
