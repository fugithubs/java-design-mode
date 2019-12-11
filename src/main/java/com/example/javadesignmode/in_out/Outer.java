package com.example.javadesignmode.in_out;

public class Outer {

	static int num = 100;
	
	static class Inner {
		
		private static String SS="SS_11111";
		
		public void showOuterValue() {
			System.out.println("Outer class property num value is : " + num);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Inner.SS);
		new Inner().showOuterValue();
		
		System.out.println("-------------我是分割线NO-1----------------");
		new Object(){
			public void show(){
				System.out.println("匿名内部类测试NO-1..................");
			}
		}.show();
		System.out.println("-------------我是分割线NO-2----------------");
		Object obj = new Object(){
			public void show(){
				System.out.println("匿名内部类测试NO-2.............");
			}
		};
		
		System.out.println(true&&true);
	}

}
