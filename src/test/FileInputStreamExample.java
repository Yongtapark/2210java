package test;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("src/test/FileInputStreamExample.java");
			int s;
			while((s=fis.read())!=-1){
				System.out.print((char)s);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
