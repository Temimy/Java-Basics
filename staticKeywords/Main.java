package staticKeywords;

public class Main {

	public static void main(String[] args) {
		
		// the constructor (same class name ) need to create instance object and run
		StaticKeywords call1 = new StaticKeywords(30,"Alaa");
		StaticKeywords call2 = new StaticKeywords(25,"Temimy");
		StaticKeywords call3 = new StaticKeywords(35,"Bedn");
		
		call1.show();
		call2.show();
		call3.show();
		
		System.out.println("---------------");
		
		// the constructor (same class name ) need to create instance object and run
		StaticIncreament count1 = new StaticIncreament();
		StaticIncreament count2 = new StaticIncreament();
		StaticIncreament count3 = new StaticIncreament();
		
		System.out.println("---------------");
		System.out.println("---------------");
		
		// the method (not class name )not need to create instance object
		// this method is called to change the static variable company
		ChangeCompany.ChangeCompanyName();
		
		ChangeCompany call4 = new ChangeCompany(30,"Alaa");
		ChangeCompany call5 = new ChangeCompany(25,"Temimy");
		ChangeCompany call6 = new ChangeCompany(35,"Bedn");
		call4.show();
		call5.show();
		call6.show();
		
		

	}
	

}
