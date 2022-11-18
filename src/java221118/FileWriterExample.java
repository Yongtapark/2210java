package java221118;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fi =new FileWriter("src/java221118/test.txt");
			fi.write("이렇게 써도 되냐?");
			fi.write(System.getProperty("line.separator"));
			fi.write("되네 ㅎㅎ;");
			fi.close();
			FileReader fr =new FileReader("src/java221118/test.txt");
			BufferedReader bi =new BufferedReader(fr);
			int c;
			String n;
//			while((c=fr.read())!=-1) {
//				System.out.print((char)c);
//			}
			
			while((n=bi.readLine())!=null) {
				System.out.println(n);
			}
			bi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
