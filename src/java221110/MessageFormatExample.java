package java221110;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id="java";
		String name ="홍길동";
		String tel ="010-123-5678";
		
		String text =" 회원 ID: {0} \n 회원 이름 : {1} \n 회원 전화 : {2}";
		String result1 =MessageFormat.format(text, id, name,tel);
		System.out.println(result1);
		System.out.println();
		
		//insert, delete, update, select => SQL, '문자' ,숫자
		String sql = "insert into member values ({0}{1}{2})";
		Object[] arguments = {"'java'", "'신용권'", "'010-123-5678'"};//'java','신용권','010-123-5678'
		String result2 =  MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
		
		
		

	}

}
