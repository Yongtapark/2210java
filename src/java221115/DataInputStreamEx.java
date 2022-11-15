package java221115;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {

	public static void main(String[] args) {
		DataInputStream dis=null;
		FileInputStream fis =null;
		try {
			fis=new FileInputStream("src/java221115/test.txt");
			dis=new DataInputStream(fis);
			//DataInputStream은 기본자료형을 유지한채로 저장된 값을
			//읽어들일 수 있는 read()가 있다.
			//읽어들일 때는 반드시 기록한 순서대로 읽어와야 한다.
			int i=dis.readInt();
			double d=dis.readDouble();
			String s=dis.readUTF();
			
			System.out.println("i값 ="+i);
			System.out.println("d값 ="+d);
			System.out.println("s값 ="+s);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
			}catch(IOException e) {
				try {
					if(dis !=null)dis.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
