package java221117;


import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr =null;
		
	
			fr =new FileReader("src/java221117/FileReaderExample.java");
			
			int readCharNo;
			//char[] cbuf =new char[100];
			
//			while((readCharNo=fr.read(cbuf))!=-1) {
//				String data =new String(cbuf,0,readCharNo);
//				System.out.print(data);
			
			while((readCharNo=fr.read())!=-1) {
				if(readCharNo!='\t'&&readCharNo!='\n'&&readCharNo!=' '&&readCharNo!='\r')
				System.out.print((char)readCharNo);
			}
			fr.close();
			
		

	}

}
