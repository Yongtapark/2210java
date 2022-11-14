package java221112;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("src/java221112/data.out");
			FileInputStream fin=null;
			
			for(int i=0; i<10; i++) {
				int n=10-i;
				fout.write(n);
			}
			fout.close();
			fin = new FileInputStream("src/java221112/data.out");
			int c=0;
			while((c=fin.read())!=-1) {
				System.out.print(c+" ");//파일에서 읽어서 화면으로 출력
			}
			fin.close();
		}catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
