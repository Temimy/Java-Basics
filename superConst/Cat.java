package superConst;

public class Cat extends Animal{
	
	public  Cat() {
		// super will bring args and run Animal constructor
		// even without super() , the JVM will create super()
		super();
		System.out.println("This is my Cat Class");
		
	}

}
