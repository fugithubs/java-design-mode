package com.example.javadesignmode.extendss;

public class B extends A {

	public String show(A obj) {

		return "B and A";
	}

	public String show(B obj) {

		return "B and B";
	}
}
