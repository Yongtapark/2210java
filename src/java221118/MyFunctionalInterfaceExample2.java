package java221118;

interface FunctionalInterface3 {
	public int method(int x, int y);
}

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		FunctionalInterface3 fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;

		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) ->{return x + y;};
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> x+y;
		System.out.println(fi.method(2, 5));
		
		fi= (x,y)->sum(x,y);
		System.out.println(fi.method(2, 5));
	}

	private static int sum(int x, int y) {
		return x+y;
	}

}
