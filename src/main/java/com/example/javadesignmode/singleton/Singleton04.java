package com.example.javadesignmode.singleton;
/**
	线程安全，并且效率高，能有多个线程访问

 */
public class Singleton04 {

	private Singleton04(){
		
	}
	private static Singleton04 instance;
	public static Singleton04 getInstance(){
		if(instance==null){
			synchronized (Singleton04.class) {
				if(instance==null){
					instance=new Singleton04();
				}
			}
		}
		return instance;
	}
}
