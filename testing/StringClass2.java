package testing;

public class StringClass2 {

	public static void main(String[] args) {
		
		String s1="Alaa";
		 // StringBuilder for single thread and use low memory allocations
		StringBuilder mn= new StringBuilder(s1);
		
		mn.append(" Temimy");
		
		
	
		
		System.out.println(mn);

	}

}
