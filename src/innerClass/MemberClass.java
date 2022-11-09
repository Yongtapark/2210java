package innerClass;

/*
 * *이너클래스 = 내부클래스 = 중첩클래스
 * -이너클래스의 이해와 특징
 * *특징 : 클래스내에 또 다른 클래스가 정의되는 것을 의미한다.
 * 		  필요한 이유? 지금까지 작업해 왔던 클래스들과는 
 * 		  독립적이지는 않지만 하나의 멤버처럼 사용할 수 있는 특징이 있다.
 * 
 * *이너클래스를 정의시 주의 사항 장점
 * -이너클래스는 외부 클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용할 수있다.
 * -static 이너클래스를 제외하고는 다른 이너 클래스는 항상 외부 클래스를 통해야 생성이 가능하다.
 * -외부클래스&내부클래스명.class로 class 파일이 만들어짐
 * 
 * *이너 클래스의 종류
 * 1. Instance MemberClass : 외부클래스의 멤버변수 선언위치에 선언.
 * 							 외부클래스의 인스턴스멤버처럼 다루어진다.
 * 							 주로 외부클래스의 인스턴스멤버들과 관련된 작업에
 * 							 사용될 목적으로 선언된다.
 * 
 * 2.static MemberClass    : 외부클래스의 멤버변수 선언위치에 선언.
 * 						 	 외부클래스의 static 멤버처럼 다루어진다.
 * 							 주로 외부클래스의 static멤버,
 * 							 특히 static 메서드에서 사용될 목적으로 선언된다.
 * 
 * 3. Local Class		   : 외부클래스의 메서드나 초기화블럭 안에 선언하여,
 * 							 선언된 영역 내부에서만 사용 될 수 있다.
 * 
 * 4. Anonymous Class      : 클래스의 선언과 객체의 생성을 동시에 하는 이름이
 *                           없는 클래스(일회용: 한번만 사용하고 버려지는 객체
 *                           를 사용 할때 유용하게 쓰인다. Swing에서 많이 씀)
 *                           
*/
//1. Instance MemberClass
public class MemberClass {
	//멤버필드 선언
	
	int aa=10;//인스턴스 멤버변수, default(현재 패키지내에서만 접근)
	private int bb=10;
	static int c=200;
	
	//내부 클래스 : 외부 클래스에 멤버, 메서드 자기것 처럼 사용.
	//클래스 선언 위치 멤버변수위치
	class Inner{
		MemberClass m=new MemberClass();
		
		//인스턴스필드, 인스턴스메소드만 가능
		// static int a;//정적필드, 정적메소드 사용불가, 메모리가 없기 때문
		//static int b=10; 
		// static void a(){};
		
		public void printData() {
			System.out.println("int aa : "+m.aa);//또는 aa
			System.out.println("int bb : "+bb);//또는 m.bb
			System.out.println("static int c : "+c);//또는 MemberClass.c
			
		}
	};//InnerClass
	public static void main(String[] args) {
		//외부클래스.내부클래스 객체명 = new   외부클래스(). new 내부클래스();
		MemberClass.Inner inner =new MemberClass().new Inner();
		inner.printData();
	}//main

}
