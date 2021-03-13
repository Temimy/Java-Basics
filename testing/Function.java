package testing;

public class Function {
	
	public static void main (String[]args) {
		
		doSomething();
		
		loopNum();
	}

	private static void loopNum() {
		int Nums=15;
		
		for (int i = 0; i < Nums; i++) {
			System.out.println(i);
			
		}
	}
	
	// static functions could be used in the same class
	private static void doSomething() {
		
		System.out.println("Alaa Temimy");
	}

}
