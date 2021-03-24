package superKey;


/*
 * without using Super key word
 */
class Animal1 {
	
	String name="Animal";
}

class Cat1 extends Animal1{
	
	String name="Cat";
	
	public void show() {
		System.out.println(name);
	}
}


public class Main {

	public static void main(String[] args) {
		
		Cat1 cat = new Cat1();
		cat.show();
		

	}

}
