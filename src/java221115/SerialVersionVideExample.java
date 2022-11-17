package java221115;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionVideExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fos =new FileOutputStream("src/java221115/Object.dat");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			ClassC classC =new ClassC();
			classC.field1=1;
			oos.writeObject(classC);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
