package testing;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class check_Date {

	public static void main(String[] args) {

		// to get date we should import Date library
		Date nDate = new Date();

		System.out.println(nDate);

		// to set specific day for Calendar , but can't printing
		// months numbered from jan.=0
		GregorianCalendar gc = new GregorianCalendar(2021, 02, 24);

		// to print the date

		// to get the date
		Date dtgc = gc.getTime();
		// to get date instance format
		DateFormat dfgc = DateFormat.getDateInstance();
		// put date instance into string
		String d2gc = dfgc.format(dtgc);

		System.out.println("the date is :" + d2gc);

		// changing the day , but can't printing
		gc.add(GregorianCalendar.DATE, 15);

		// to print the new date
		Date dt = gc.getTime();

		DateFormat df = DateFormat.getDateInstance();

		String d2 = df.format(dt);

		System.out.println("the new date is :" + d2);

	}

}
