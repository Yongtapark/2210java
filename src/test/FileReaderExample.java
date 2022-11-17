package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		try {
			fr=new FileReader("src/test/FileInputStreamExample.txt");
			int c;
			char[] cbuf=new char[100];
			while((c=fr.read(cbuf))!=-1) {
				String data=new String(cbuf,0,c);
				System.out.print(data);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		fr.close();}
	}
}
