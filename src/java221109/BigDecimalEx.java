package java221109;

import java.math.BigDecimal;

public class BigDecimalEx {

	public static void main(String[] args) {
		BigDecimal a= new BigDecimal("123456789.123123112313212313213245999999996789");
		
		//movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b= a.movePointLeft(3);
		System.out.println(b);// ==> 123456.789123456789
		
		//나눗셈 (반올림 하지 않는다.)
		BigDecimal c=a.divide(b,BigDecimal.ROUND_DOWN);
		System.out.println(c);// ==> 1000.000000000
		
		//유효자리(소수점 이하 5번째 자리)
		c= a.divide(b, 5, BigDecimal.ROUND_DOWN);
		System.out.println(c);// ==> 1000.00000
		
		//BigDecimal 객체로 변환
		System.out.println(a.toBigInteger()); // ==>123456789

	}

}
