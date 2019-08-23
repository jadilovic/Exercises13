package Vjezbe;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class displayCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 2){
			System.out.println("Usage: displayCalendar month year");
			System.exit(0);
		}
		
		String month = args[0];
		int monthN = Integer.parseInt(month);
		String year = args[1];
		int yearN = Integer.parseInt(year);
		int day = 1;
		
		Calendar cal = new GregorianCalendar(yearN, monthN - 1, day);
		printHeading(cal);
		
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
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
