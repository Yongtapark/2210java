package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String file ="src/test/FileInputStreamExample.java";
		String filecopy="src/test/FileInputStreamExample.java2.txt";
		
		try {
			FileInputStream fi =new FileInputStream(file);
			FileOutputStream fo=new FileOutputStream(filecopy);
			
			int c;
			while((c=fi.read())!=-1) {
				fo.write(c);
			}
			
			fo.close();
			fo.close();
			fi.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
