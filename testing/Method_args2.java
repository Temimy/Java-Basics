package testing;

class Alaa_2 {
	public void bedn(String t, String b) { // define input parameter
		System.out.println(t + " " + b);
	}

	public void number(int age) {  // define args type
		System.out.println("age :" + age);
	}
}

public class Method_args2 {

	public static void main(String[] args) {
		Alaa_2 zaid = new Alaa_2(); // class object (link)

		zaid.bedn("Alaa", "Bedn"); // should send args
		zaid.number(25); // the same link to class
							// with different method
	}
}
