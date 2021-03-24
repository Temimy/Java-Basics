package methodOverriding;

public class Cat extends Animal{
	
	/*
	 * copy methods from method Animal
	 * and replace required information
	 */

	public void eat() {
		System.out.println("The Cat is eating");
	}

	public void sleep() {
		System.out.println("The Cat is sleeping");
	}

	public void play() {
		System.out.println("The Cat is playing");
	}

}
