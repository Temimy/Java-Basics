package varConstructor;

public class Main {

	public static void main(String[] args) {
		
		// VarConstructor
		// the parameters should added to the constructor when declared
		// the parameters will go to the constructor
		VarConstructor name = new VarConstructor(30,"Alaa");
//		System.out.println(name.name);
//		System.out.println(name.num);
		
		// print variables
		name.show();
		
		// new constructor with new variables
		VarConstructor name2 = new VarConstructor(15,"Fotha");
		name2.show();
		System.out.println("-------------------");
		
		// VarConst2 
		// constructor selection based on number and type of variables
		VarConst2 Alaa1 = new VarConst2("Alaa","Bedn");
		VarConst2 Alaa2 = new VarConst2("Alaa","Bedn",30);
		
		Alaa1.show();
		Alaa2.show();
		
		
		

	}

}
