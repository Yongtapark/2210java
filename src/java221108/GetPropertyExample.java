package java221108;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String file = System.getProperty("file.separator");
		
		System.out.println("운영체제 이름 : "+osName);
		System.out.println("사용자 이름 : "+userName);
		System.out.println("사용자 홈디렉토리 : "+userHome);
		System.out.println("파일 단락 문자 : "+file);
		
		System.out.println("-----------------------------");
		System.out.println("[ key ] value");
		System.out.println("-----------------------------");
		Properties props = System.getProperties();
		//Collection => list(중복(o),정렬(o)/set(중복(x),정렬(x) 
		//: 저장 = list객체.add(객체) 인출 = list객체.get(인덱스)
		
		//Map        => '키,갑' 한쌍으로 되어있는 구조, 키는 중복되면안됨, 
		//키중복(x), 값중복(o), 정렬(x), 연관메모리
		//: 저장 = map객체.push(키,값) 인출 = map객체.get(키)
		
		Set keys =props.keySet();//키저장
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.println("[ "+key+" ] "+value);
		}

	}

}
