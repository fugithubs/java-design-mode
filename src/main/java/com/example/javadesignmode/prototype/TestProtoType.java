package com.example.javadesignmode.prototype;

public class TestProtoType {

	public static void main(String[] args) {
		AbstractProtoType sp=new SoupProtoType();
		AbstractProtoType s2=(AbstractProtoType) sp.clone();
		System.out.println(s2.getName());
		System.out.println(s2.getIdcard());
	}

}
