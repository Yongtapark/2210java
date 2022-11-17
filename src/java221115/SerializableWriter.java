package java221115;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args)  {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("src/java221115/Object.dat");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			ClassA classA =new ClassA();
			classA.field=1;
			classA.field2.field1=2;
			ClassA.field3=3;
			classA.field4=4;
			oos.writeObject(classA);
			oos.flush();oos.close();fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
