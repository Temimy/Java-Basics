package staticKeywords;

public class StaticKeywords {

	int age;
	String name;
	// declare static variable only one time
	// this variable loaded from memory only one time
	static String company = "Iraq";

	public StaticKeywords(int intn, String strs) {

		age = intn;
		name = strs;

	}
	
	// this method is not static
	// so that its need an instance to run
	public void show() {

		System.out.println(name + "  " + age + " " + company);
	}

}
