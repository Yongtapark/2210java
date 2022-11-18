package java221118;
interface MyFunction3{
	void print();
}
public class LambdaEx3 {

	public static void main(String[] args) {
		MyFunction3 f = () -> {
			System.out.println("hello");
		};
		
		f.print();
		
		f= ()->{
			System.out.println("안녕하세용용");
		};
		f.print();

	}

}
