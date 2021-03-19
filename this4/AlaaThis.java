package this4;

public class AlaaThis {
	// method
	public void Ali() {
		System.out.println("Alaa Temimy");
		System.out.println("------------");
		System.out.println("------------");
		
	}
	
	// method
	public void Hayder() {
		System.out.println("Hayder");
		// calling method Ali
		this.Ali();
	}
	
	// loop method
	public void Bedn() {
		// we can use this or not
		// it's better to use this
		// to reduce errors and ram usage
		
		System.out.println("Bedn");
		// calling method Hayder
		Hayder(); // jvm will add this internally
	}

}
