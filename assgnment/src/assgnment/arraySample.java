package assgnment;

public class arraySample {
public static void main(String[] args) {
		
		int[] arr = new int[5];
		int i = 5;
		try {
			arr[i] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception. "+e.getMessage());
		}
		finally {
			i = arr.length-1;
			System.out.println("Array index set to "+i);
		}
}}
