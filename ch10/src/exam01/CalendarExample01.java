package exam01;

import java.util.*;

// Calendar클래스-예제2,3
// set()으로 날짜와 시간지정하기 
// void set(int field, int value)
// void set(int year, int month, int date)
// void set(int year, int month, int date, int hourOfDay, int minute)
//void set(int year, int month, int date, int hourOfDay, int minute, int second)
//사용법 예시
// -날짜 지정하는 방법
//Calendar date = Calendar.getInstance();
//date.set(2017, 7, 15); // 2017년 8월 15일(7월 아님)
//date.set(Calendar.YEAR, 2017);
//date.set(Calendar.MONTH, 7);
//date.set(Calendar.DATE, 15);
public class CalendarExample01 {
	public static void main(String[] args) {
		//요일은 1부터 시작하기 때문에 DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야한다.
		//date1.set(2019, Calendar.APRIL, 29); 와 같이 할수도 있다.
		date1.set(2019, 3, 29); // 2019년 4얼 29일로 날짜를 설정한다.
		System.out.println("date1은 " + toString(date1) + 
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("date2은 " + toString(date2) + 
				DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		
		//두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위오 변환해야한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("그 날(date1)부터 지금(date2)까지" + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일입니다."); //1일 = 24*60*60
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월" 
				+ date.get(Calendar.DATE) + "일";
	}

}
