package java221116;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_04 {

	public static void main(String[] args) {
		ObjectInputStream ois=null;
		
		try {
			/* 파일에 저장된 객체를 읽어들이기 위해
			   ObjectInputStream 객체 생성
			   역직렬화 : 원래 자료형으로 변환
			   역직렬화 할때 필요한 클래스 파일을 찾지 못할 경우
			   ClassNotFoundException을 발생시킨다.
			*/
			ois=new ObjectInputStream(new FileInputStream("src/java221116/test2.txt"));
			Data data =(Data) ois.readObject();
			System.out.println("------------------------");
			System.out.println("번호 :"+data.getNo());
			System.out.println("이름 :"+data.getName());
			System.out.println("이메일 :"+data.getMail());
			
			System.out.println(data.toString());
		}catch (Exception e) {
			e.getStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
			}catch (IOException e) {
				e.getStackTrace();
			}
			
		}

	}

}
