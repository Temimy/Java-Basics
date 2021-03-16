package varConstructor;



public class VarConstructor {
	int num;
	String name;
	
	public VarConstructor (int n , String s) {
	// allocating values to variables
		num=n;
		name=s;
		
		
	}
	
	// new method for printing
	public void show() {
	System.out.println("name is :" +name);	
	System.out.println("age is :" +num);
	}

}
