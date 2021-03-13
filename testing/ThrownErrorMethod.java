package testing;

public class ThrownErrorMethod {

	public static void main(String[] args) {
		// 1-create throws method for errors
		// 2- put it inside try - catch
		
		try {
			myArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			// e.printStackTrace();
			System.out.println("There is an error "
					+ "in array index");
		}
		
		

	}

	private static void myArray()
	throws ArrayIndexOutOfBoundsException {
		int[] num= {4,8,2}; 		
		System.out.println(num[3]);
	}

}
