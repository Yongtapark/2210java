package java221115;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	static void read() {
		FileInputStream in = null;
		try {
			int c;
			in = new FileInputStream("src/java221115/test2.txt");

			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
	
	static void write() {
		FileWriter fout = null;
		InputStreamReader in = new InputStreamReader(System.in);
		try {
			int c;
			fout = new FileWriter("src/java221115/test2.txt");
			while ((c = in.read()) != -1) {
				fout.write(c);

			}
			fout.flush();
			in.close();
			fout.close();

		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}

	public static void main(String[] args) {
		FileWriter fout = null;
		FileInputStream in = null;
		
		//read();
		write();
		
		read();
		
		

	}

}
