package java221117;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamex {

	public static void main(String[] args)  {
		FileInputStream fis =null;
		try {
			fis =new FileInputStream("src/java221117/FileInputStreamex.java");
			
			int c;
			while((c=fis.read())!=-1) {
				System.out.write(c);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
