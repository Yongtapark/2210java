package java221118;
interface MyFunctionalInterface{
	public void method();
}
 class UsingLocalVariable{
	void method(int arg) {//arg는 final 특성을 가짐 원래 그냥 가지는것인가?
		int localVar = 40;//localVar는 final 특성을 가짐 얘는 왜? 그냥??
		//지역변수 안에 내부 클레스가 있다면 메소드는 final 특서을 가짐
		//int arg =32;  //final 특성 때문에 수정 불가
		//localVar =41; //final 특성 때문에 수정 불가
		
		
		//람다식
		MyFunctionalInterface fi =()->{
			System.out.println("arg: "+arg);
			System.out.println("localVar"+localVar+"\n");
		};
		fi.method();
	}
}
		
public class UsingLocalVariableExample {

	public static void main(String[] args) {
		UsingLocalVariable ulv= new UsingLocalVariable();
		ulv.method(20);

	}

}
