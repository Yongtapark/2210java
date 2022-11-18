package java221118;

interface FunctionalInterface2 {
	public void method(int x);
}

public class MyFunctionalInterfaceExample3 {

	public static void main(String[] args) {
		FunctionalInterface2 fi;

		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);

		};

		fi.method(2);

		fi = x -> {
			System.out.println(x * 5);
		};
		fi.method(2);

		fi = x -> System.out.println(x * 5);
		fi.method(2);

	}

}
