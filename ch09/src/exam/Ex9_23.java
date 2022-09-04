package exam;

/*
 * 날짜 : 2022/09/04
 * 이름 : 서정현
 * 내용 : java.lang패키지 - 래퍼(wrapper)클래스
 */
public class Ex9_23 {
	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ? " + (i == i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
		System.out.println("i.toString = " + i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MAX_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("BYTES = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE);
		Integer num = 1000;
		double sd = num.doubleValue(); 
		String n = String.valueOf(sd);
		System.out.println(n);
	}
	
}
