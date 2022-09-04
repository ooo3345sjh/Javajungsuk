package exam;

/*
 * 날짜 : 2022/09/04
 * 이름 : 서정현
 * 내용 : java.lang패키지 - 래퍼(wrapper)클래스
 * 	- 오토박싱 & 언박싱(autoboxing & inboxing)
 */
public class Ex9_25 {
	public static void main(String[] args) {
		
		int i = 10;
		
		//기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = (Integer)i; // Integer intg = Integer.valieOf(i);
		Object obj = (Object)i;    // Object obj = (Object)Integer.valuOf(i);
		
		Long lng = 100L; // Long lng = new Long(100L);
		
		int i2 = intg + 10; // 참조형과 기본형간의 연산 가능
		long l = intg + lng; // 참조형 간의 덧셈도 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; //참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i    = "+i);
		System.out.println("intg = "+intg);
		System.out.println("obj  = "+obj);
		System.out.println("lng  = "+lng);
		System.out.println("intg + 10  = "+i2);
		System.out.println("intg + lng = "+l);
		System.out.println("intg2= "+intg2);
		System.out.println("i3   = "+i3);
		System.out.println("intg2 + i3 = "+intg3);
	}
	
}
