package java221116;

import java.io.Console;

public class ConsoleExmaple {

	public static void main(String[] args) {
		Console console =System.console();
		
		System.out.println("아이디 :");
		String id= console.readLine();
		
		System.out.println("패스워드:");
		char[]	charPass = console.readPassword();
		String strPassword =new String(charPass);//char[]배열을 문자열로 생성
		
		System.out.println("---------------");
		System.out.println(id);
		System.out.println(strPassword);
				
				

	}

}