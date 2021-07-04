package assgnment;

@SuppressWarnings("serial")
public class customException extends NullPointerException{

	public customException(String s) {
		System.out.println("Custom Exception: "+s );
	}

}

