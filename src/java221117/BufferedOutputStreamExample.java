package java221117;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream bi = null;
		BufferedOutputStream bo =null;
		
		int data= -1;
		long start=0;
		long end=0;
		
		
			fi= new FileInputStream("E:\\front\\jquery_w\\images\\Jellyfish.jpg");
			bi= new BufferedInputStream(fi);
			fo= new FileOutputStream("C:\\tmp\\cat.jpg");
			
			start = System.currentTimeMillis();
			while((data=bi.read())!=-1) {
				fo.write(data);
			}
				fo.flush();
				bi.close();
				fi.close();
				
			end = System.currentTimeMillis();
			System.out.println("안 썼을 때 :"+(end-start)+"ms");
			
			fi= new FileInputStream("E:\\front\\jquery_w\\images\\Jellyfish.jpg");
			bi= new BufferedInputStream(fi);
			fo= new FileOutputStream("C:\\tmp\\cat.jpg");
			bo = new BufferedOutputStream(fo);
			start = System.currentTimeMillis();
			while((data=bi.read())!=-1) {
				bo.write(data);
			}
			bo.flush();
			bo.close();
			end = System.currentTimeMillis();
			System.out.println("썼을 때 :"+(end-start)+"ms");
	
			
			
		
		

	}

}
