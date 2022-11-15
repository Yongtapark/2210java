package java221115;

import java.io.FileWriter;
import java.io.IOException;
//FileWriter 파일에 텍스트 기록하기
public class FileWriter_test01 {

	public static void main(String[] args) throws IOException {
		FileWriter writer=null;
		try {
			//파일에 한문자 단위로 기록할 수 있는 FileWriter 객체 생성
			writer=new FileWriter("src/java221115/test.txt");
			//writer는 문자열을 바로 기록할 수 있다.
			
			String str="학교종이 땡땡땡 어서 모이자";
			writer.write(str);
			//한글자(2바이트) 단위로 읽고 쓸 수 있는 Reader,Writer 계열의
			//스트림은 내부적으로 버퍼를 내장하고 있다.
			//내장된 버퍼는 버퍼가 가득 채워질 때에만 스트림을 통해
			//내보낸다. flush()는 버퍼가 가득 차지 않아도 비우게 한다.
			
			writer.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(writer !=null)writer.close();
		}

	}

}
