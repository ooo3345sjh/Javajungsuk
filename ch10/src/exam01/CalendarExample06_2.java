package exam01;

import java.text.*;

// java.text패키지의 DecimalFormat, SimpleDateFormat
// 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자, 날짜 -> 형식 문자열)

public class CalendarExample06_2 {
	public static void main(String[] args) throws ParseException {
		//예제
		
		double number = 1234567.89;
		String[] pattern = {
				"0",
				"#",
				"0.0",
				"#,#",
				"0000000000.0000",
				"##########.####",
				"#.#-",
				"-#.#",
				"#,###.##",
				"#,####.##",
				"#E0",
				"0E0",
				"##E0",
				"00E0",
				"####E0",
				"0000E0",
				"#.#E0",
				"0.0E0",
				"0.000000000E0",
				"00.00000000E0",
				"000.0000000E0",
				"#.##########E0",
				"##.#########E0",
				"###.########E0",
				"#,###.##+;#,###.##-",
				"#.#%",
				"#.#\u2030",
				"\u00A4 #,###",
				"'#'#,###",
				"''#,###",
		};
		
		for(int i=0; i<pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n", pattern[i], df.format(number));
		}
		
		
		
		
		
	}		
	
}
