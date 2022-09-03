package exam01;

import java.util.*;
// Calendar클래스-예제4,5
// add()는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향O) 
// roll()은 특정필드의 값을 증가 또는 감소(다른 필드에 영향X)

public class CalendarExample04 {
	public static void main(String[] args) {
		
	Calendar date = Calendar.getInstance();
	date.set(2019, 7, 31); //2019년 8월 31일
	
	System.out.println(toString(date));
	System.out.println();
	System.out.println("= 1일 후 =");
	date.add(Calendar.DATE, 1);
	System.out.println(toString(date));
	System.out.println();
	
	System.out.println("= 6달 전 =");
	date.add(Calendar.MONTH, -6);
	System.out.println(toString(date));
	System.out.println();
	
	System.out.println("= 31일 후(roll) =");
	date.roll(Calendar.DATE, 31);
	System.out.println(toString(date));
	System.out.println();
	
	System.out.println("= 31일 후(add) =");
	date.add(Calendar.DATE, 31);
	System.out.println(toString(date));
	System.out.println();
	
		
	}

	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " +  
		date.get(Calendar.DATE) + "일";
	}
}
