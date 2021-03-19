package this3;

public class AlaaThis {
	
	int num;
	String name;
	String dept;
	
	public AlaaThis(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
		
	public AlaaThis(int num, String name, String dept) {
		// using pre-defined arguments
		// call
		this(num,name);

		this.dept = dept;
	}


	public void show() {
		
		System.out.println("name :"+name+ " Age :"+num +" Dept :"+dept);
	}
	
	
	
	
	

}
