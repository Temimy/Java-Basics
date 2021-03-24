package aggregation;

// student class is for single student 
// special information like id
// this class will include Student Info general variables too
public class Student {
	
	// define only parameters not defined into St_info
	// each student have a unique ID
	int id;
	
	// aggregation = class name  variable
	StudentInfo varStudentInfo;
	/* so that all information in StudentInfo
	 * can bring here
	 */
	
	// create constructor
	// all applicable variables of varStudentInfo can be used
	public Student(int id, StudentInfo varStudentInfo) {
		
		this.id = id;
		this.varStudentInfo = varStudentInfo;
	}
	
	// output variables
	public void show() {
		
		System.out.println("id ="+id);
		System.out.println("age ="+varStudentInfo.age);
		System.out.println("name ="+varStudentInfo.name);
		System.out.println("dept ="+varStudentInfo.dept);
		System.out.println("address ="+varStudentInfo.addrs);
	}
	
	
	
	
	
	

}
