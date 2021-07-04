package com.edureka;



public class Excercises {
	
	public static void main(String[] args) {
		
		
		//1.1
		System.out.println("Excercise 1.1");
		int[] ar = {2,4,6,8,10};
		int[] specificIndex = new int[] {1,2,4};
		for(int i:specificIndex) {
			System.out.println(ar[i]);
		}
		
		//1.2
		System.out.println("Excercise 1.2");
		int TwoDArray[][] = {
		                 {1,2},
		                 {3,4}
		};
		System.out.println(TwoDArray[0][1]);
	}

}
