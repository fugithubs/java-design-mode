package com.example.javadesignmode.singleton;
/**
	饿汉方式的单例模式：线程安全，但效率比较低，一开始就加载类new一个对象

 */
public class Singleton01 {

	private Singleton01(){
		
	}
	private static final Singleton01 instance=new Singleton01();
	public static Singleton01 getInstance(){
		return instance;
	}
}
