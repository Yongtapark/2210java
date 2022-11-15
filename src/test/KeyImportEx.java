package test;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KeyImportEx {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String src;
		
		System.out.println("자바 소스 파일 이름을 입력하세요>>");
		String scr=s.next();
		
		try {
			FileReader fr =new FileReader(scr);
			BufferedOutputStream bout =new BufferedOutputStream(System.out);
			
			int c;
			
			while((c=fr.read())!=-1) {
				bout.write(c);
			}
			fr.close();
			bout.close();
		}catch(IOException e) {
			System.out.println("입력오류");
		}
		}

	

}
