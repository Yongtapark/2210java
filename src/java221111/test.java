package java221111;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	Map<String,String> map =new Hashtable<String,String>();
	Scanner sc=new Scanner(System.in);
	
	map.put("admin", "admin@1234");
	
	while(true) {
		System.out.println("아이디를 입력");
		String id =sc.nextLine();
		System.out.println("비밀번호를 입력");
		String password=sc.nextLine();
		if(map.containsKey(id)) {
		if(map.get(id).equals(password)) {
			System.out.println("로그인됨");
			break;
			}else {
				System.out.println("비밀번호 틀림");
			}
		}else {
			System.out.println("아이디가 없음");
		}
	}

	}

}
