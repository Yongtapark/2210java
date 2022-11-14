package java221112;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream in =null;
		try {
			in=new FileInputStream("src/java221112/data.txt");
			
			int c;
			while ((c=in.read())!=-1) {
				System.out.print((char)c);
				
			}
			in.close();
		}catch(IOException e){
			System.out.println("입출력 오류");
		}

	}

}
