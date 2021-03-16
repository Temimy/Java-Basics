package varConstructor;

public class VarConst2 {

	String name;
	String lastName;
	int salary;

	// the JVM select the constructor based on
	// the number and type of the input variables
	public VarConst2(String s1, String s2) {

		name = s1;
		lastName = s2;

	}

	public VarConst2(String s3, String s4, int num) {

		name = s3;
		lastName = s4;
		salary = num;

	}

	public void show() {

		if (salary == 0) {
			System.out.println(name + "  " + lastName);

		} else {
			System.out.println(name + "  " + lastName + "  " + salary);
		}
	}

}
