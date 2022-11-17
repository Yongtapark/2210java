package java221117;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		File file =new File("src/java221117/FileWriterExample.java");
		FileWriter fw= null;
		
		
		try {
			fw= new FileWriter(file,true);
			fw.write("이게되네");
			fw.flush();
			fw.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
