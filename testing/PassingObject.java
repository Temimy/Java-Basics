package testing;

public class PassingObject {

	public static void main(String[] args) {
		int nums[]= {1,2,3}; // array object
		
		System.out.println("the number is :"+ nums[0]);
		addingValue(nums); // passing object to method
		System.out.println("the number is :"+ nums[0]);
	}
	
	private static void addingValue (int[] num) {
		
		num[0]++;
		System.out.println("the number is :" + num[0]);
	}
	
} // class
