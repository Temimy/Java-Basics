package methodOverriding;

public class Dog extends Animal{
	
	/*
	 * copy methods from method Animal
	 * and replace required information
	 */

	public void eat() {
		System.out.println("The Dog is eating");
	}

	public void sleep() {
		System.out.println("The Dog is sleeping");
	}

	public void play() {
		System.out.println("The Dog is playing");
	}

}
