package testing;

public class OverLoadMethod {

	public static void main(String[] args) {
		
		// use of 2 inputs
		int num1=2;
		int num2=8;
		int result = sum(num1,num2); // call method directly
		System.out.println("the result of 2 inputs is :"+ result);
		
		// use of 3 inputs
		int num3=5;
		int result2 = sum(num1,num2,num3); // call method directly
		System.out.println("the result of 3 inputs is :"+ result2);
		
		// use of String to integer
		String str1="14", str2 = "25"; 
		int result3 = sum (str1,str2);
		System.out.println("the result of strings is :"+ result3);
		

	}
	
	private static int sum(int n, int m) { // method sum 2 inputs
		
		return n+m;
	}
	
	private static int sum(int n, int m , int l) { // same method name sum 3 inputs
		
		return n+m+l;
	}
	
	private static int sum(String s1 , String s2) { // same method name sum 3 inputs
		
		int v1= Integer.parseInt(s1); // String to number
		int v2= Integer.parseInt(s2);
		
		return v1+v2; // as integer number
	}

} // class brackets



