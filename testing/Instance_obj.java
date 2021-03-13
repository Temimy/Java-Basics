package testing;

public class Instance_obj {

	public static void main(String[] args) {

	// creat instance
//	Hayder abc = new Hayder(); // open link to instance
//	
//	abc.i=5; //  define a value for i into class Hayder
//	
//	System.out.println(abc.i);
	
		// or
    // use instance directly
		Hayder.i=10;
		System.out.println(Hayder.i);
	
	Hayder.bedn();

	}

}

class Hayder { // class name should not used in the package

	// int i; // variable without value
	// or 
	static int i;

	public static void bedn() {

		System.out.println("Alaa Temimy");
		System.out.println(i); // since i is static we can print it
	}
}