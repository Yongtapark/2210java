package java221115;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class answer {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bout =new BufferedOutputStream(System.out,20);
		
		FileReader fin=new FileReader("src/java221115/test.txt");
		
		int c;
		while((c=fin.read())!=-1) {
			bout.write((char)c);
		}
		fin.close();
		bout.close();
		
		
	}

}
