package daily;

import java.util.Scanner;

public class ExtInput {

	private static Scanner in;

	public static String ExtractedInput() {

		in = new Scanner(System.in);
		String name = in.next();
		return name;
	}

}
