package com.Alaa.Calc.math;

import java.util.Scanner;

public class InpVar {

	private static Scanner in;

	// enter 1st values
	public static Double inpVar1() {

		in = new Scanner(System.in);
		System.out.println(" insert first no :");
		double n1 = in.nextDouble();

		return n1;
	}

	// enter 2nd value
	public static Double inpVar2() {

		in = new Scanner(System.in);

		System.out.println(" insert second no :");
		double n2 = in.nextDouble();

		return n2;
	}

}
