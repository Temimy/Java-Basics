package testing;

import java.util.HashMap;

public class HashMapC {

	public static void main(String[] args) {
	 
		// define HashMap include key , value

		HashMap<String,String> hm1 = new HashMap<String,String>();
		
		// putting values  key , value
		
		hm1.put("Alaa","Temimy");
		hm1.put("Akeel","Bedn");
		hm1.put("Fotha","Engineer");
		
		System.out.println(hm1);
		// putting new values  key , value
		// new values are non-ordered with original values
		
		hm1.put("Horry","Dental");
		System.out.println(hm1);
		
		// getting value based on key
		 System.out.println(hm1.get("Alaa"));
		 
		 // removing values based on key
		 hm1.remove("Akeel");
		 System.out.println(hm1);
		 
		 // to show all keys
		 System.out.println(hm1.keySet());
		
		
		
		
		
		
		
		
	}

}
