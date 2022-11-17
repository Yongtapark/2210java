package java221117;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Calendar;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fo= new FileOutputStream("c:/tmp/ala.txt");
		PrintStream ps= new PrintStream(fo);
		
		ps.println("[얄리얄리 얄라셩]");
		ps.print("얄라리 얄라");
		ps.flush();
		ps.close();
		fo.close();
		
		FileReader fr =new FileReader("c:/tmp/ala.txt");
		int c;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
			
		}

	}

}
