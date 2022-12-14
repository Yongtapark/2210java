package java221108;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name =Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println("1."+e.getMessage());
		}
		
		try {
			String name= Objects.requireNonNull(str2,"이름이 없습니다.");
			
		}catch(Exception e) {
			System.out.println("2."+e.getMessage());
		}
		
		try {
			String name=Objects.requireNonNull(str2,()->"이름이 없다니깐요");
		}catch(Exception e) {
			System.out.println("3."+e.getMessage());
		}
		
		System.out.println(Objects.toString(str1));//값이있으면 값으로
		System.out.println(Objects.toString(str2));//null 인경우 null로
											//null이면 디폴트값으로 나옴
		System.out.println(Objects.toString(str2, "이름이 없습니다."));

	}

}
