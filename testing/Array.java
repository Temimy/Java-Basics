package testing;
<<<<<<< HEAD
// checking git and github
=======
// remove checking git and git hub
>>>>>>> 6c4a969ab1fb1de742686b7f7ce676744a098a5e
public class Array {

	public static void main(String[] args) {
				
		// create arrays
		
		String[] str = new String [4];
		
		for (String st : str) {
			System.out.println(st);
		}
		
		int[] num= new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		 // brackets []  after variable name
		double dob[]= new double[3];
		for (int i = 0; i < dob.length; i++) {
			System.out.println(dob[i]);
		}
		
		// define array parameters directly
		String[] names= {"Alaa","Bedn","Temimy"};
		for (String strnam : names) {
			System.out.println(strnam);
		}

	}

}
