package testing;

public class PassingString {

	public static void main(String[] args) {
		
		String m= "Bedn";
		
		System.out.println(" the original string is :" + m);
		
		strP(m);
		System.out.println(" string after is :" + m);

	}

	private static void strP (String s) {
		s = "Alaa";
		System.out.println(" the string in method is :"+ s);
	}
	
	
} // class
