package com.edureka;

public class Calculator {
	
	public Integer add(Integer a,Integer b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(4, 3));
	}
	
}
