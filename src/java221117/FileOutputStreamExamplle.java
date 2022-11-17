package java221117;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExamplle {

	public static void main(String[] args) {
		String originalFile = "C:\\tmp\\Dir\\cat.png";
		String targetFile ="C:\\tmp\\cat.png";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream(originalFile);
			fos=new FileOutputStream(targetFile);
			
			int readByteNo;
			//byte[] readBytes = new byte[100];
			while((readByteNo=fis.read())!=-1) {//
				
				fos.write(readByteNo);
			}
			/*
			 * while((readByteNo=fis.read(readBytes))!=-1) {//
			 * fos.write(readBytes,0,readByteNo); }
			 */
			
			fos.flush();
			fos.close();
			fis.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
