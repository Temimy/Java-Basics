package testing;

public class Instanse_Method {

	public static void main(String[] args) {
	
	// create object for instance
	// bedn is object from class Alaa - temimy method
	// this link allow to run temimy method	
		Alaa bedn = new Alaa();   // class= Alaa , object =bedn
		bedn.temimy();
		

	}

}


// this class is out of Instanse_Method
// so that we need to create an object
// to get into it

class Alaa {
	
	public void temimy () {
		System.out.println("Alaa Temimy");
		
	}
}
