package testing;

class Alaa_1 {
	public  void bedn (String t) {  // define input parameter
		System.out.println(t);
		
		
	}
	
}

public class Method_args {

	public static void main(String[] args) {
		Alaa_1 zaid= new Alaa_1();
		
		zaid.bedn("Alaa"); // should send args
		zaid.bedn("Bedn"); // should send args
		 
	//	Alaa_1.bedn("hello");  use when public static void bedn (String t)

	}

}
