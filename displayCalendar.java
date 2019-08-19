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
		
		Calendar cal = new GregorianCalendar(day, monthN, yearN);
		for(int i = 1; i <= cal.getMaximum(day); i++){
			System.out.println(i);
		}
		
		cal.getMaximum(day);
	}

}
