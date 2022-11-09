package java221109;

public class StringChatAtExample {

	public static void main(String[] args) {
		String ssn= "010624-1230123";
		char sex= ssn.charAt(7);//ssn의 7번째 자리에 따라 값이 변함
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}

	}

}
