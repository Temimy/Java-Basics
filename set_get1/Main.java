package set_get1;

public class Main {

	public static void main(String[] args) {
	
		// create object
		Alaa employee = new Alaa(356,"Alaa","Code", "Baghdad");
		employee.show();
		
		int ide= employee.getId(); // this will return id value
		System.out.println("id = "+ide);
		
		// setting value
		System.out.println(" changing id ");
		employee.setId(653);
		employee.show();
		
		String x=employee.getName();
		System.out.println("Name is "+x);
		System.out.println(" changing Name ");
		employee.setName("Bedn");
		employee.show();
		
		// changing Name and Dept together
		System.out.println(" changing Name and Dept ");
		// jvm will select the required method
		// based on argument number and type
		employee.setName("Temimy", "Mech");
		employee.show();
		
		

	}

}
