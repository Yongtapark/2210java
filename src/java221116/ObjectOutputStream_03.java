package java221116;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_03 {

	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		
		try {
			/*메모리에 생성된 객체를 직렬화 해서 스트림을 통해
			  기록 할 수 있는 ObjectOutputStream 객체 생성
			  ObjectOutputStream을 통해서 직렬화된 후 파일로 기록된 DATA
			  객체 생성 Data클래스는 반드시 Serializable을 구현하고 있어야 한다. 
			*/
			oos= new ObjectOutputStream(new FileOutputStream("src/java221116/test2.txt"));
			Data data=new Data();//직렬화할 객체 생성
			data.setNo(30);
			data.setName("홍길순");
			data.setMail("honggilsoon@naver.com");
			
			oos.writeObject(data);//직렬화 된 데이터(test3.txt)에 저장
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				if(oos !=null)oos.close();
			}catch(Exception e) {
				e.getStackTrace();
			}
			
		}

	}

}
