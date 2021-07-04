package com.textcourse;

import java.util.regex.*;

public class RegularExpression {

	
	public static void main(String[] args) {
		
		try {
			int[] ar = new int[3];
			System.out.println(ar[4]);
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
		String pattern = "[a-z]+";
		String check = "check this";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(check);
		while(m.find()) {
			System.out.println(check.substring(m.start(),m.end()));
		}
	}
}
