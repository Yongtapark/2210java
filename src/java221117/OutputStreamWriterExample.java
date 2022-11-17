package java221117;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos =new FileOutputStream("c:/tmp/file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data= "이게 써지네";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");

	}

}
