package java221111;

import java.util.Scanner;

public class homework1 {
	static void putChars(char c, int n) {
		while (n-- > 0) 
			System.out.print(c);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단 :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			putChars(' ', n - i);
			putChars('+', i);
			System.out.println();
		}

	}

}
