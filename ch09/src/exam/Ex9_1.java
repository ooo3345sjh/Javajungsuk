package exam;

/*
 * 날짜 : 2022/09/04
 * 이름 : 서정현
 * 내용 : java.lang패키지 - Object클래스
 * 	- equals(Object obj)
 */
public class Ex9_1 {
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	}

}

class Value {
	
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	@Override
		public boolean equals(Object obj) {
			
			if(!(obj instanceof Value)) return false;
			
			return value == ((Value)obj).value;
		}
}
