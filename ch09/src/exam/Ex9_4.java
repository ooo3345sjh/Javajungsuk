package exam;

import java.util.Objects;

/*
 * 날짜 : 2022/09/04
 * 이름 : 서정현
 * 내용 : java.lang패키지 - Object클래스
 * 	- equals(Object obj)
 * 	- hashCode()
 * 	- toString()
 */
class Card {
	
	String kind;
	int number;
	
	public Card() {
		this("SPADE", 1);
	}
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	@Override
		public int hashCode() {
			return Objects.hash(kind, number);
		}
	
	@Override
		public boolean equals(Object obj) {
		
			if(!(obj instanceof Card)) {
				return false;
			}
			
			Card card = (Card)obj;
			return this.kind.equals(card.kind) && this.number == card.number;
	}
	
	//Object클래스의 toString()을 오버라이딩
	@Override
	public String toString() {
		return "Kind : " + kind + ", number : " + number ;
	}
}

public class Ex9_4 {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}
	
}
