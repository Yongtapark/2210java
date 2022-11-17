package java221115;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialversionExample2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("src/java221115/Object.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			ClassC classC =(ClassC) ois.readObject();
			System.out.println("field1 "+classC.field1);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
