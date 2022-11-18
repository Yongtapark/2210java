package java221118;
interface MyFunction4{
	int calc(int x, int y);
}
public class LambdaEx4 {

	public static void main(String[] args) {
		printMultyply(3,4,(x,y)->x*y);

	}

	static void printMultyply(int x, int y, MyFunction4 f) {
		System.out.println(f.calc(x,y)); // 메인 안에다가 정의!!!! 기억
		
	}

}
