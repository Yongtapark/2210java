package java221115;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) {
		try {
		
			BufferedWriter bf = new BufferedWriter(new FileWriter("src/java221115/buffered.txt"));
			bf.write("버퍼 테스트...");
			bf.newLine();
			bf.write("안녕하세요." + System.getProperty("line.separator"));
			bf.write("바이바이...");
			bf.flush();
			BufferedReader br = new BufferedReader(new FileReader("src/java221115/buffered.txt"));

			int c;
			while ((c = br.read()) != -1) {
				System.out.print((char) c);
			}
			bf.close();
			br.close();
		} catch (IOException e) {
			System.out.println("잘못된 입출력");
		}
	}
}