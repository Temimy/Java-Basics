package testing;

public class RunTimeErrorHandling {

	public static void main(String[] args) {
		
		int[] num= {4,8,2}; // array index 0,1,2 only
		/*
		// the array has not value in index 3
		// error message will terminate the run
		System.out.println(num[3]);
		
		// this statement not run due to previous error
		System.out.println("Alaa Temimy");
		*/
		
		
		// the array has not value in index 3
		// error message will terminate the run
		// so that we use try-catch 
		try {
			System.out.println(num[3]);
		} catch (ArrayIndexOutOfBoundsException e) {  // e is the error type
			// catch (Exception e) {  // e is the error type , normal statement
			// catch (ArrayIndexOutOfBoundsException e) {  // the error is described , modified statement
			
			// normal error message
			//e.printStackTrace();
			System.out.println("there is an error in the array index");
		}
		
		// this statement continue run with existence of previous error
		System.out.println("Alaa Temimy");
		

	}

}
