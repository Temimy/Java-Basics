package testing;

public class PassingPermititve {

	public static void main(String[] args) {
		
		int num1 =10;
		 System.out.println("before :" + num1);
		 addingValue(num1);
		 System.out.println("after :" + num1);
	}
	
	private static void addingValue (int num) { // no return value
		num++;
		System.out.println("num :" +num);
	}

} // class
