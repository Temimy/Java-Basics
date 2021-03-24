package aggregation;

public class Main {

	public static void main(String[] args) {
	
	// input Student general information
	// if the variables values is defined previously
	// we will not need the following statements
	StudentInfo stuInfo1 = new StudentInfo(40, "Alaa", "Code", "Baghdad");
	StudentInfo stuInfo2 = new StudentInfo(45, "Bedn", "Mech", "Basrah");
	
	// Student Id
	Student stuId1 = new Student(145, stuInfo1);
	Student stuId2 = new Student(265, stuInfo2);
	
	stuId1.show();
	System.out.println("--------------");
	stuId2.show();
	
	
		
	}

}
