package com.Alaa.Calc.math;

public  class CaseSwitch {

	public static double casSwitch(int oper, double na, double nb) {

		double result = 0;
		// case switches
		switch (oper) {
		case 1:
			result = FnlCalc.addValue(na, nb);

			break;
		case 2:
			result = FnlCalc.subValue(na, nb);

			break;
		case 3:
			result = FnlCalc.multValue(na, nb);

			break;
		case 4:
			result = FnlCalc.divValue(na, nb);

			break;

		default:
			break;
		}

		// System.out.println(" the result is :" + result);
		// double results2=result;
		return result;

	}

}
