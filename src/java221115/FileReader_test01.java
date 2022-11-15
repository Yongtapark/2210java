package java221115;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_test01 {

	public static void main(String[] args) throws IOException {
		FileReader reader=null;
		try {
			//파일로부터 한문자단위로 읽어 올 수 있는 FileReader 객체 생성
			reader=new FileReader("src/java221115/test.txt");
			//스트림을 통해서 읽어들인 유니코드 값을 저장하는 변수
			int readValue=0;
			while((readValue=reader.read())!=-1) {
				System.out.print((char)readValue);
			}
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(reader !=null)reader.close();
		}

	}

}
