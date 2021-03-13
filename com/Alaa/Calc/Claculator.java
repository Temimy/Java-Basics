package com.Alaa.Calc;

import com.Alaa.Calc.math.CaseSwitch;
import com.Alaa.Calc.math.InpVar;
import com.Alaa.Calc.math.OperSel;

public class Claculator {

	public static void main(String[] args) {

		// Select operation , no sender values
		int oper = OperSel.Oper();

		// input variables , no sender values
		double na = 0;
		na = InpVar.inpVar1();
		double nb = 0;
		nb = InpVar.inpVar2();

		// go to the case switch with oper , na ,nb
		// case switch call calculation methods
		// and get results

		double result2 = CaseSwitch.casSwitch(oper, na, nb);
		System.out.println("The result is :"+result2);
	}

}
