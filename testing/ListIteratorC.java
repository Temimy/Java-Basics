package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ListIteratorC {

	public static void main(String[] args) {

		// create Array list and add variables
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println("Array List");
		System.out.println(list);

		// using of ListIterator
		// to make loop inside array list
		ListIterator<Integer> lsIt = list.listIterator();
		System.out.println("Array List values");
		while (lsIt.hasNext()) {
			int val = lsIt.next();
			System.out.println(val);
		}

		// create HashMap and add variables
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("AK", "AV");
		hm2.put("BK", "BV");
		hm2.put("CK", "CV");
		System.out.println("Hash Map");
		System.out.println(hm2);
		
		// using of Iterator
		// to make loop inside Hash MAp
		// we need to get the keys of HashMap
		// key set should convert to String set not array
		Set<String> keys=hm2.keySet();
		
		System.out.println(keys);
		
		Iterator<String> stIt=keys.iterator();
		
		while (stIt.hasNext()) {
			String stItk=stIt.next(); // to get keys one by one
			System.out.println(stItk+" "+hm2.get(stItk));
		}
		

	}

}
