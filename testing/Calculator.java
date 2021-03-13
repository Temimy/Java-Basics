package testing;

import java.util.Scanner;

public class Calculator {

	private static Scanner in;

	public static void main(String[] args) {

		int ops=0;
		
		double results2=0;

		in = new Scanner(System.in);

		// control input in range 1-4
		while (ops < 1 || ops > 4) {
			System.out.print(" Select operation");

			System.out.println(" 1= add , 2= sub , 3= mult , 4= div");

			ops = in.nextInt();

		}

		// enter 2 values
		System.out.println(" insert first no :");
		double n1 = in.nextDouble();

		System.out.println(" insert second no :");
		double n2 = in.nextDouble();

		// case switching
		results2 = casesSwitch(ops, n1, n2);
		System.out.println(" the result is :" + results2);

		

	}

	private static double casesSwitch(int ops, double n1, double n2) {
		
		double result=0;
		
		switch (ops) {
		case 1:
			result = addValue(n1, n2);

			break;
		case 2:
			result = subValue(n1, n2);

			break;
		case 3:
			result = multValue(n1, n2);

			break;
		case 4:
			result = divValue(n1, n2);

			break;

		default:
			break;
		}

		//System.out.println(" the result is :" + result);
		double results2=result;
		return results2;
	}

	// add values
	private static double addValue(double n1, double n2) {
		double result = n1 + n2;
		return result;

	}

	// subtract values
	private static double subValue(double n1, double n2) {
		double result = n1 - n2;
		return result;

	}

	// multiplication values
	private static double multValue(double n1, double n2) {
		double result = n1 * n2;
		return result;

	}

	// division values
	private static double divValue(double n1, double n2) {
		double result = n1 / n2;
		return result;

	}

}// class
