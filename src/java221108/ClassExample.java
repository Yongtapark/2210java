package java221108;

import java221101.Car;

public class ClassExample {

	public static void main(String[] args) {
		Car car =new Car();
		Class clazz1=car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();

		try {
			//Class 생성자가 있는 감춰져 있어 new 연산자로 객체 생성할수 없음
			//Class.forName("패키지명.클래스명");해서 class객체를 얻어와야함.
			//2. 객체생성 x 클래스객체 얻어오기
			Class clazz2 =Class.forName("java221101.Car");//db에서 드라이버 로딩할때 많이 쓰임
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
