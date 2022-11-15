package java221115;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class new1 {

	public static void main(String[] args) {
		try {
		FileInputStream fin =new FileInputStream("src/java221115/test.txt");
		InputStreamReader in=new InputStreamReader(fin,"US-ASCII");
		int c;
		
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		
		}catch(IOException e){
			System.out.println("입출력 오류");
		}

	}

}
