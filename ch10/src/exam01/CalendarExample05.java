package exam01;

import java.util.*;

// Date와 Calendar간의 변환
// Date의 메서드는 대부분 deprecated되었지만 여전히 사용  

public class CalendarExample05 {
	public static void main(String[] args) {
		//Calendar를 Date로 변환
		Calendar cal1 = Calendar.getInstance();
		Date a = new Date(cal1.getTimeInMillis()); //Date(long date)
		
		//Date를 Calendar로 변환
		Date b = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(b);
	}		
}
