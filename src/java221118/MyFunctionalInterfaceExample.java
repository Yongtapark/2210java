package java221118;

interface FunctionalInterface1{
	public void method();
}
public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		FunctionalInterface1 fi;
		
		fi =() ->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi =() ->{
			System.out.println("method call2");
		};
		fi.method();
		
		fi =() ->
			System.out.println("method call2");
		fi.method();
		
}}
