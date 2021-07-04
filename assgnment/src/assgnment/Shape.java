package assgnment;

import java.util.Scanner;

public class Shape {
	private static int len,width;
	
	private boolean isSquare() {
		return len==width;
	}
	
	public static void main(String[] args) throws NotASquareException {
		
		Shape temp = new Shape();
		
		System.out.println("Enter the length and width");
		
		Scanner s = new Scanner(System.in);
		len = s.nextInt();
		width = s.nextInt();
		s.close(); 
	
		if(temp.isSquare()) 
			System.out.println("It is a square");
		else {
			System.out.println("It is not a square");
			throw new NotASquareException("NotASquare");
		}
			
	}
	
}
