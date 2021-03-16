package staticKeywords;

public class StaticIncreament {
	
	// static here to declare this integer once
	// so that it get the increment
	// each time of calling
	static int intCount;
	
	// the integer return to its value each time of 
	// call constructor
	//  int intCount;
	
	public StaticIncreament() {
		
		System.out.println("count = "+intCount);
		intCount++;
	}
	

}
