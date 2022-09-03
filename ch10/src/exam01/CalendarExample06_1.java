package exam01;

import java.text.*;

// java.text패키지의 DecimalFormat, SimpleDateFormat
// 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자, 날짜 -> 형식 문자열)

public class CalendarExample06_1 {
	public static void main(String[] args) throws ParseException {
		//DecimalFormat
		//숫자를 원하는 형식으로 쉽게 출력 가능(숫자 -> 형식 문자열)
		double number = 1234567.89;
		DecimalFormat df1 = new DecimalFormat("#.#E0");
		String result = df1.format(number);
		
		//형식 문자열에서 숫자를 뽑아내는 기능(형식 문자열 -> 숫자)
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		Number num1 = df2.parse("1,234,567,89"); //모든 숫자 Wraper클래스의 최고 조상
		double a = num1.doubleValue(); //1234567.89
		//[참고] Interger.parseInt()는 콤마(,)가 포함된 문자열을 숫자로 변환 못함
		
		
		//예제
		DecimalFormat df3 = new DecimalFormat("#,###.##");
		DecimalFormat df4 = new DecimalFormat("#.###E0");
		
		try {
			Number num2 = df3.parse("1,234,567.89");
			System.out.print("1,234,567.89 -> ");
			
			double d = num2.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.println(df4.format(d));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}		
	
}
