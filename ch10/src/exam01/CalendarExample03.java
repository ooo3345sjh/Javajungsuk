package exam01;

import java.text.*;
import java.util.*;
// Calendar클래스-예제2,3
// clear()으로 Calendar객체의 모든 필드를 초기화 
// clear(int field)는 Calendar객체의 특정 필드를 초기화

public class CalendarExample03 {
	static int getDaydiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1;
			int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));			
			
			int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
			
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			date1.clear(); //ms에서 차이가 발생하므로 EPOCH TIME으로 초기화를 해주어야함.
			date2.clear(); //Thu Jan 01 00:00:00 KST 1970
			
			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);
			
			diff = (int)(date1.getTimeInMillis() - date2.getTimeInMillis())/(24*60*60*1000);
			
		} catch(Exception e) {
			diff = 0; // subString(), parseInt()에서 예외가 발생하면 0을 반환한다.
		}
		
		return diff;
	}
	public static void main(String[] args) {
		System.out.println(getDaydiff("20010103", "20010101"));
		System.out.println(getDaydiff("20010103", "20010103"));
		System.out.println(getDaydiff("20010103", "200103"));
		
		
	}

}
