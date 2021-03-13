package testing;

import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {

		String[] str = { "a", "b", "c", "d", "e" };

		/*
		// for loop
		// Always use for primitive data

		
		for (int i = 0; i < str.length; i++) { 
			  System.out.println(str[i]);
		  
		  }
		  
		  // for each loop 
		  // always use for complex object
		  
		for (String strname : str) { // String to be String , int ... 
			                         // strname temporary name string 
			                         // str array variable name System.out.println(strname);
		  
		  }
		 
		
		 // while loop
		 
		int counter=0;
		 while (counter<str.length) {
			 System.out.println(str[counter]);
			counter++; 
						
		}
		
		*/
		
		// Do - while loop
//		int counter=0;
//		
//		do {    // run statements then check the condition
//			 System.out.println(str[counter]);
//			counter++;
//		}
//		 while (counter<str.length);
         
		// loop for numbers
		
		int[] numbers= {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		

	} // main

} // class loop
