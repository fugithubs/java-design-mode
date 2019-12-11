package com.example.javadesignmode.extendss;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println(a1.show(b));
		System.out.println(a1.show(c));
		System.out.println(a1.show(d));
		System.out.println("-------分割线1---------");
		System.out.println(a2.show(b));
		System.out.println(a2.show(c));
		System.out.println(a2.show(d));
		System.out.println("-------分割线2---------");
		System.out.println(b.show(b));
		System.out.println(b.show(c));
		System.out.println(b.show(d));
	}

}
