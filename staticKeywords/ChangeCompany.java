package staticKeywords;


public class ChangeCompany {
	
	int age;
	String name;
	// declare static variable only one time
	// this variable loaded from memory only one time
	static String company = "Iraq";
	
	// create static method to change static variable
	static void ChangeCompanyName() {
		company = "Baghdad";
		System.out.println(" new company is " +company);
				
	}
	
	// create constructor to read input variables rather than static variable "company"
	public ChangeCompany (int intn, String strs) {

		age = intn;
		name = strs;

	}
	
	// this method is not static
	// so that its need an instance to run
	public void show() {
	System.out.println(name + "  " + age + " " + company);
		
	}
	

}
