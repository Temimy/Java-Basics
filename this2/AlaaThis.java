package this2;

public class AlaaThis {
	
	int num;
	String name;
	
	// empty constructor without arguments
	AlaaThis(){
		System.out.println("Alaa Temimy");
	}

	public AlaaThis(int num, String name) {
		// calling constructor ( AlaaThis ) using this
		// this calling should be at the beginning 
		// of constructor
		this();
		
		// this for variables
		this.num = num;
		this.name = name;
	}
	
	public void show() {
		System.out.println("name is "+name+"  age :"+num);
		
	}
	
	

}
