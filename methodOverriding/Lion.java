package methodOverriding;

public class Lion extends Animal{
	
	/*
	 * copy methods from method Animal
	 * and replace required information
	 */

	public void eat() {
		System.out.println("The Lion is eating");
	}

	public void sleep() {
		System.out.println("The Lion is sleeping");
	}

	public void play() {
		System.out.println("The Lion is playing");
	}

}
