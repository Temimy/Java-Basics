package set_get1;

public class Alaa {
	// employee informations
	private int id;
	private String name;
	private String dept;
	private String addrs;

	// create constructor by using R-click - Source -
	// using constructor fields
	public Alaa(int id, String name, String dept, String addrs) {
		// adding "this" to run faster
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.addrs = addrs;
	}

	/* 
	 * */
	// create method to get arguments
	public int getId() {

		return id;
	}
	
	// create set method to set arguments
	public void setId(int ide) {  // this id will replace id value
		id=ide;
	}

	public String getName() {

		return name;

	}
	
	// create set method to set arguments
	// can used to change all variables values
	public void setName(String s) {  // this id will replace id value
		name=s;
	}
	
	public void setName(String d, String m) {
		name=d;
		dept=m;
	}

	public void show() {

		System.out.println("id = " + id + " ,name :" + name + " ,dept :" + dept + " ,addrs:" + addrs);
	}

}
