package com.Alaa.Calc.math;

import java.util.Scanner;

public class OperSel {
	private static Scanner in;

	// int ops is the returning value to the other classes
	public static Integer Oper() {

		// Select operation

		in = new Scanner(System.in);

		int ops = 0;
		// control input in range 1-4
		while (ops < 1 || ops > 4) {
			System.out.print(" Select operation");

			System.out.println(" 1= add , 2= sub , 3= mult , 4= div");
			System.out.print("   ");

			ops = in.nextInt();

		}

		return ops;

	}

}
