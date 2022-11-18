package java221118;
@FunctionalInterface//주석타입이 아니라고 나옴 => 다른곳에서 재정의해서 그랬음 --
interface MyFunction5<T>{
	void print(T x);
}

public class LambdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction5<String> f1= (x) ->System.out.println(x.toString());
		MyFunction5<Integer> f2= (x) -> System.out.println(x.toString());
		
		f1.print("ABc");
		
		
		f2.print(1234);
	}

}
