package testing;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeStep {

	public static void main(String[] args) {
		// to get date we should import Date library
		Date nDate = new Date();
		System.out.println("Date is :" + nDate);

		long yr = nDate.getTime();
		System.out.println(yr);
		System.out.println("Date is :" + nDate);

//		nDate.setTime(1615000000);
		yr = nDate.getTime();

		System.out.println(yr);
		System.out.println("Date is :" + nDate);

		System.out.println(" Day function not working");
		System.out.println(" ------------------------");

		System.out.println(" Calender functions");
		// to set specific day for Calendar , but can't printing
		// months numbered from jan.=0
		// get current time with total variables
		GregorianCalendar startTime = new GregorianCalendar();
		int st1 = startTime.get(Calendar.MILLISECOND);

		System.out.println(st1);
		// System.out.println(st1-yr);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1000000000; j++) {
				// System.out.println(i);
			}
		}
		
		GregorianCalendar endTime = new GregorianCalendar();
		// GregorianCalendar endTime = new GregorianCalendar();
		// System.out.println(endTime.get(Calendar.MILLISECOND));

		int st2 = endTime.get(Calendar.MILLISECOND);
		System.out.println(st2);
		System.out.println(st2 - st1);
//		
//		GregorianCalendar currentTime = new GregorianCalendar();
//		
//		
//		long ct=currentTime.getTimeInMillis();
//		System.out.println(ct);
//		
//		ct=currentTime.getTimeInMillis();
//		System.out.println(ct);
//		
//		ct=currentTime.compareTo(startTime);
//		System.out.println(ct);

//		// to print the date
//
//		// to get the date
//		Date dtgc = startTime.getTime();
//		
//		// to get date instance format
//		DateFormat dfgc = DateFormat.getDateInstance();
//		// put date instance into string
//		String d2gc = dfgc.format(dtgc);
//
//		System.out.println("the date is :" + d2gc);
//
//		// changing the day , but can't printing
//		startTime.add(GregorianCalendar.DATE, 15);
//
//		// to print the new date
//		Date dt = startTime.getTime();
//
//		DateFormat df = DateFormat.getDateInstance();
//
//		String d2 = df.format(dt);
//
//		System.out.println("the new date is :" + d2);

	}

}
