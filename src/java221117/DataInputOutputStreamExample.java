package java221117;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fi= null;
		DataInputStream di =null;
		FileOutputStream fo=null;
		DataOutputStream dp=null;
		
		fo = new FileOutputStream("c:\\tmp\\test.data");
		dp = new DataOutputStream(fo);
		
		dp.writeUTF("홍길동");
		dp.writeDouble(88.8);
		dp.writeInt(2);
		
		dp.writeUTF("홍갈동");
		dp.writeDouble(98.8);
		dp.writeInt(1);
		
		dp.flush();
		dp.close();
		fo.close();
		
		fi = new FileInputStream("c:\\tmp\\test.data");
		di = new DataInputStream(fi);
		
		for(int i=0; i<2; i++) {
			String name =di.readUTF();
			double score = di.readDouble();
			int age =di.readInt();
			System.out.println(name+" "+score+" "+age);
		}

	}

}
