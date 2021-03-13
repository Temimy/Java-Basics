package testing;

public class Switch_cases {

	public static void main(String[] args) {

		int number = 3;

		switch (number) {
		case 1: { // number=1
			System.out.println(" This is number 1");
			break;
		} // break to lead code to go to the end of cases

		case 2: {
			System.out.println(" This is number 2");
			break;
		}

		case 3: {
			System.out.println(" This is number 3");
			break;
		}

		default:
			System.out.println("This is greter than 1,2,3");
			break;
		}

	}
}


