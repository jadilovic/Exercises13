package Vjezbe;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class displayCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calP = new GregorianCalendar();
		int monthN = 0;
		int yearN = 0;
		int day = 1;
		
		if(args.length < 1){
			System.out.println("Usage: displayCalendar month year");
			monthN = calP.get(Calendar.MONTH);
			yearN = calP.get(Calendar.YEAR);
		}
		else if(args.length == 1){
			monthN = Integer.valueOf(args[0]) - 1;
			yearN = calP.get(Calendar.YEAR);
		}
		else {
		monthN = Integer.valueOf(args[0]) - 1;
		yearN = Integer.valueOf(args[1]);
		}
		
		Calendar cal = new GregorianCalendar(yearN, monthN, day);
		printHeading(cal);
		
		// print space before first day in week
		for(int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++)
			System.out.print("    ");
		
		while(cal.get(Calendar.DATE) < cal.getActualMaximum(Calendar.DATE)){
			if(cal.get(Calendar.DAY_OF_WEEK) == 7)
				System.out.printf("%4d\n", cal.get(Calendar.DATE));
				else
					System.out.printf("%4d", cal.get(Calendar.DATE));
			
			cal.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d\n", cal.get(Calendar.DATE));
	}

	public static void printHeading(Calendar cal) {
		String[] months = getMonths();
		
		int center = 29/2 - (months[cal.get(Calendar.MONTH)].length()/2 + 3);
		for(int i = 0; i < center; i++)
			System.out.print(" ");
		System.out.println(months[cal.get(Calendar.MONTH)] + ", " + cal.get(Calendar.YEAR));
		
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	public static String[] getMonths() {
		String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
		return months;
	}

}
