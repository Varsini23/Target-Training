package assgnment;

public class sampleException {
		String str;
		
		sampleException(){
			this.str = null;
		}
		
		private void method1() throws customException {
			try {
				method2();
			}
			catch (NullPointerException e) {
				throw new customException("String is null");
			}
		}
		private void method2(){
			System.out.println("First letter of the string"+str.charAt(0));
			
		}
		public static void main(String[] args) {
			sampleException ex = new sampleException();
			try {
				ex.method1();
			}
			catch(customException e) {
				System.out.println("Exception message: "+e.getMessage());
			}
			
			
		}
	}

