package java221115;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in=null;
		FileInputStream fin =null;
		try {
			fin=new FileInputStream("src/java221115/test.txt");
			in= new InputStreamReader(fin,"UTF-8");
			int c;
			
			System.out.println("인코딩 문자의 집합은 "+in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
