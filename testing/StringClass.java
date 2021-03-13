package testing;

public class StringClass {

	public static void main(String[] args) {
		String s1="Alaa Temimy";
		System.out.println(s1);
		String s2= new String ("AlAA Temimy");
		
		System.out.println(s2);
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println(" they match");
		}
		
		char[] ch=s1.toCharArray();
		
		for (char c : ch) {
			System.out.println(c);
		}
		

	}

}
