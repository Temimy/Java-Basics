package testing;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		
		ArrayList<String> arrStr = new ArrayList<String>();
		
		arrStr.add("Alaa");
		arrStr.add("Bedn");
		arrStr.add("Temimy");
		
		System.out.println(arrStr);
		
		// adding more strings to the array 
		// during run time
		arrStr.add("Engineer");
		arrStr.add("Java");
		
		System.out.println(arrStr);
		
		// remove strings from the array 
		// during run time
		
		arrStr.remove(3);
		System.out.println(arrStr);
		
		// get variable at index 3
		
		System.out.println(arrStr.get(3));
		
		// this method we can put it into variable
		
		String var=arrStr.get(2);
		
		System.out.println(var);
		
		// get index of specific string
		String strVar="Java";
		
		int pos=arrStr.indexOf(strVar);
		
		System.out.println(pos);
		
		System.out.println(" String at position "+pos+ " is"+arrStr.get(pos));
		
		
		



	}

}
