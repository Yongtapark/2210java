package java221118;
interface MyFunction{// 인터페이스로 구현!?
	int calc(int x, int y);
}
public class LambdaEx1 {

	public static void main(String[] args) {
		MyFunction add= (x,y) -> {return x+y;};
		// 람다식은 정의를 메인 안에서 하는것이 신기하다;;
		MyFunction minus = (x,y) -> x -y;
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(1, 2));

	}

}
