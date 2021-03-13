package testing;

public class Debuger2 {

	public static void main(String[] args) {
		int[] numb = { 2, 5, 9 };

		try {
			System.out.println(numb[3]);
		} catch (Exception e) {
			// get the exact error message
			System.out.println(e.getMessage());
		}

		System.out.println("Alaa Temimy");

	}

}
