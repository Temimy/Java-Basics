package testing;

public class Array2D {

	public static void main(String[] args) {
		// to create 2D array

		String[][] names = { { "Alaa", "Temimy" }, { "Ali", "Hayder" } };

//		System.out.println(names[0][0] + " " + names[0][1]);
//		System.out.println(names[1][0] + " " + names[1][1]);

		// another define procedure

		String[][] employees = new String[2][2];
		employees[0][0] = "Alaa";
		employees[0][1] = "Temimy";
		employees[1][0] = "Ali";
		employees[1][1] = "Hayder";
//		System.out.println(employees[0][0] + " " + employees[0][1]);
//		System.out.println(employees[1][0] + " " + employees[1][1]);

		for (int i = 0; i < employees.length; i++) {

			// define string builder inside (for)
			// to re-new its value each iteration
			StringBuilder strempl = new StringBuilder();

			for (int j = 0; j < employees.length; j++) {

				if (j == 0) {
					strempl.append("Name is : "); // first name
				} else {
					strempl.append(" , Father Name is : "); // father name
				}

				strempl.append(employees[i][j]);

			} // end j

			System.out.println(strempl);

		} // end i

	}// end main

} // end class
