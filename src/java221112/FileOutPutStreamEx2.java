package java221112;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout =new FileOutputStream("src/java221112/data.txt");
			FileInputStream fin= null;
			
//			for(int i=0; i<10; i++) {
//				int n=10-i;//계산의 결과를 저장
//				fout.write(n);//파일으ㅔ 결과값을 바이너리로 저장
//			}
			int n= 123;
			fout.write(n);//파일으ㅔ 결과값을 바이너리로 저장
			
			fout.close();//스트림을 닫는다.
			fin = new FileInputStream("src/java221112/data.txt");
			int c=0;
			while((c=fin.read())!=-1) {
				System.out.print(c+" ");
			}
			fin.close();
			
		}catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
