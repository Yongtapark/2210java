package java221117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is= System.in;
		Reader reader =new InputStreamReader(is);
		BufferedReader bf =new BufferedReader(reader);
		
		System.out.println("입력");
		String line =bf.readLine();
		
		System.out.println("출력: "+line );
		

	}

}
