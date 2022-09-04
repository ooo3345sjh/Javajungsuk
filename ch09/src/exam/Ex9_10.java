package exam;

/*
 * 날짜 : 2022/09/04
 * 이름 : 서정현
 * 내용 : java.lang패키지 - String클래스
 * 	- StringJoiner 
 * 	- 문자열과 기본형 변환
 */
public class Ex9_10 {
	public static void main(String[] args) {
		
		int iVal = 100;
		String strVal1 = String.valueOf(iVal); //int를 String으로 변환한다.(성능이 좋음)
		String strVal2 = iVal + "";	           //int를 String으로 변환한다.(가독성이 좋음)
		
		double dVal = 200.0;
		String strVal3 = dVal + "";
		
		double sum = Integer.parseInt("+" + strVal1) //문자열을 숫자로 바꾸는 방법
										  + Double.parseDouble(strVal3);
		double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal3);
		
		System.out.println(String.join("", strVal1, "+", strVal3, "=") + sum);
		System.out.println(strVal1 + "+" + strVal3 + "=" + sum2);
	}
	
}
