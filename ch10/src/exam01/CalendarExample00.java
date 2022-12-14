package exam01;

import java.util.*;
// Calendar클래스-예제1
// get()으로 날짜와 시간 필드 가져오기 - int get(int field)
public class CalendarExample00 {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("\t[날짜]");
		System.out.println("---------------------------------------");
		
		//기본적으로 현재날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance(); //Calendar객체를 생성, 현재 날짜와 시간으로 셋팅됨

		int thisYear = today.get(Calendar.YEAR); //올해가 몇년인지 알아낸다.
		System.out.println("올해는 " + thisYear + "입니다.");
		
		today.set(Calendar.DAY_OF_MONTH, 24);

		int lastDayOfMonth = today.getActualMaximum(Calendar.DATE); //이달의 마지막날
		System.out.println("이 달의 마지막날은 : " +lastDayOfMonth);
		
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		// DATE와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		System.out.println("---------------------------------------");
		System.out.println("\t[시간]");
		System.out.println("---------------------------------------");
		System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
		//천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60)
		//한국과 TimeZone의 시차는 9시간 
		System.out.println("TimeZone(-12~+12)_GMT기준 시차(천분의 일초단위): " 
		+ today.get(Calendar.ZONE_OFFSET));///(60*60*1000));
		
		System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
		
		
	}

}
