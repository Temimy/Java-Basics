package testing;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
		// inserting from key board

		Scanner in = new Scanner(System.in); // define input parameter

		System.out.print(" input your name :");
		String s = in.nextLine(); // waiting for input string

		System.out.print(" input your age :");
		int m = in.nextInt(); // waiting for input integer

		System.out.println(" your name is :" + s);
		System.out.println(" your age is :" + m);

		in.close(); // close input scanner

	}

}
