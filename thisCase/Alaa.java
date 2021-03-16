package thisCase;

public class Alaa {

	int age;
	String name;
	static String comp = "Iraq";

	public Alaa(int age, String name) {
		// "this" is used to declare arguments inside class
		// instance variables this.age = class variable age
		// instance variables this.name = class variable name
		// no need to use "this" if the argument is different from
		// the argument used in the constructor or method
		this.age = age;
		this.name = name;
	}

	public void show() {

		System.out.println(name + "  " + age);
	}

}
