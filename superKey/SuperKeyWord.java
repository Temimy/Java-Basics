package superKey;

class Animal2 {
	
	String name="Animal";
}

class Cat2 extends Animal2{
	
	String name="Cat";
	
	/*
	 * super.name return Animal value for name
	 * and not Cat
	 */
	public void show() {
		System.out.println(super.name);
		System.out.println(name);
	}
}


public class SuperKeyWord {

	public static void main(String[] args) {
		
		Cat2 cat = new Cat2();
		cat.show();
		

	}

}
