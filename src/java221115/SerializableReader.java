package java221115;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableReader {

	public static void main(String[] args) {
		FileInputStream fis;

		try {
			ObjectInputStream ois;
			fis = new FileInputStream("src/java221115/Object.dat");
			ois = new ObjectInputStream(fis);
			ClassA v;
			v = (ClassA) ois.readObject();
			System.out.println("field1: " + v.field);
			System.out.println("field2.field1: " + v.field2.field1);
			System.out.println("field3: " + v.field3);
			System.out.println("field4: " + v.field4);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입출력 에러");
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		 System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("오류");
		}
		

	}

}
