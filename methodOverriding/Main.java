package methodOverriding;

public class Main {

	public static void main(String[] args) {
		
	/* define instance variables
	 * 	
	 */
		
		Cat varCat = new Cat();
		Dog varDog = new Dog();
		Lion varLion = new Lion();
		
		/*
		 * calling Cat,Dog,Lion classes
		 * these classes extends from Animal class
		 * but they have own methods
		 * that overriding Animal methods 
		 */
		varCat.eat();
		varDog.eat();
		varLion.eat();

	}

}
