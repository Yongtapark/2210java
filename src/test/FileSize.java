package test;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		File f =new File("src/java221115/FileWriterEx.java");
		System.out.println(f.getAbsolutePath());
		System.out.println("파일의 크기 : "+f.length());
		

	}

}
