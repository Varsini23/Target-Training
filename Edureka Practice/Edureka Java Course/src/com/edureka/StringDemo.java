package com.edureka;

public class StringDemo {
	
	public static void main(String[] args) {
		String s = "Ferrf999";
		String d = "Ferrf";
		System.out.println("Length: "+s.length());
		System.out.println(s.substring(2));
		System.out.println(s.compareTo(d));
		System.out.println(s.isEmpty());
		System.out.println(s.toUpperCase());
		System.out.println(String.valueOf(50)); // converts to string
		System.out.println(d.toLowerCase());
		System.out.println(s.replace('9', '0'));
		System.out.println(s);
		
		
		
		StringBuffer str = new StringBuffer("Hi there!");
		str.append(" Good morning");
		System.out.println(str);
		
	}

}
