package varConstructor;

public class Main {

	public static void main(String[] args) {
		// the parameters should added to the constructor when declared
		// the parameters will go to the constructor
		VarConstructor name = new VarConstructor(30,"Alaa");
//		System.out.println(name.name);
//		System.out.println(name.num);
		
		// print variables
		name.show();
		
		// new constructor with new variables
		VarConstructor name2 = new VarConstructor(15,"Fotha");
		name.show();

	}

}
