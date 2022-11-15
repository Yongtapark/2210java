package java221112;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		FileReader in =null;
		try {
			//파일로부터 문자 입력 스트림 생성
			in=new FileReader("src/java221112/file.txt");
			int c;
			while((c=in.read())!=-1) {//한 문자씩 읽는다.
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
