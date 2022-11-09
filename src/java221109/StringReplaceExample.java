package java221109;

public class StringReplaceExample {

	public static void main(String[] args) {
	String oldStr="자바는 객체지향언어 입니다. 자바는 풍부한 api를 지원합니다";
	String newStr=oldStr.replaceAll("자바","java");
	System.out.println(oldStr);
	System.out.println(newStr);
	
	}

}
