package java221117;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos =new FileOutputStream("C:/tmp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//Object => 바이트로 저장
		
		oos.writeObject(10);
		oos.writeObject(3.14);
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject("홍길동");
		
		oos.flush();oos.close();fos.close();
		
		FileInputStream fis =new FileInputStream("C:/tmp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);//바이트 => Object로 저장
		
		Integer obj1= (Integer) ois.readObject();
		Double obj2= (Double) ois.readObject();
		int[]obj3= (int[]) ois.readObject();
		String obj4=(String) ois.readObject();
		
		ois.close();fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0]+","+obj3[1]+","+obj3[2]);
		System.out.println(obj4);

	}

}
