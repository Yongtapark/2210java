package java221116;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.PrintWriter;

public class PrintWriter_01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		try {
			fos=new FileOutputStream("src/java221116/test.txt");
			bos =new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			pw.println("상쾌한아침입니다.");
			pw.println("기분좋게 공부 해요");
			pw.println(160000);
			pw.println(true);
			
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
				if(pw!=null)pw.close();
			}catch(Exception e) {
				e.getStackTrace();
			}
		}

	}

}
