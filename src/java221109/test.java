package java221109;

import java.util.Scanner;

public class test {
	void star() {
		int size=0;
		for(int i=0;i<size;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		test t=new test();
		
		System.out.println("원하는 삼각형 크기");
		int size =sc.nextInt();
		t.star();

	}

}
