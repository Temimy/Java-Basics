package inher;

// super class
class Employee{
	int salary = 5000;
}

// inheritance classes
// sub class
class addValue extends Employee{
	int add=1000;
}

public class Main {

	public static void main(String[] args) {
		addValue sal = new addValue();
		/*
		 * sal is defined from addValue
		 * but we call another parameter wich is salary
		 * from Employee 
		 * this is done by inheritance
		 */
		int empSal=sal.salary;
		System.out.println("Salary is :"+empSal);
		
		/* add values from addValue
		 * 
		 */
		empSal=empSal+sal.add;
		System.out.println("final Salary is :"+empSal);
		

	}

}
