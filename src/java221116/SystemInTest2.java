package java221116;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러번을 쓰고 엔터를 누르쇼");
		int i;
		try {
			while((i=System.in.read())!='\n') {
				System.out.print(((char)i)); 
			}
		}catch(IOException e) {
			
		}

	}

}
