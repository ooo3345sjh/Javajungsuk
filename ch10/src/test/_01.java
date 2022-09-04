package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _01 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다. ");
		
		for(int i = cal.get(Calendar.MONDAY); i<12; i++) {
			cal.set(Calendar.MONTH, i);
			
			for(int j = 1; j<=cal.getMaximum(Calendar.DAY_OF_MONTH); j++) {
				cal.set(Calendar.DAY_OF_MONTH, j);
				if(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 2 && cal.get(Calendar.DAY_OF_WEEK) == 1) {
					
					Date date = new Date(cal.getTimeInMillis());
					System.out.println(sdf.format(date));
					
				}
			}
		}
	}

}
