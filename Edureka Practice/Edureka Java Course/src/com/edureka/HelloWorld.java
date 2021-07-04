package com.edureka;

public class HelloWorld {
	
	void test1() {
		System.out.println("Not static");
	}
	static void test2() {
		System.out.println("Static");
	}
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		System.out.println("Hello World");
		h.test1();
		test2();
		
		String s1 = "Happy";
		System.out.println(s1.concat(" Learning"));
	}
	
	
}
