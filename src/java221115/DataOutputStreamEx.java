package java221115;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1. 스트림이란?
 * 데이터를 목적지로 입출력하기 위한 방법
 * 스트림에 데이터를 쓸 수 있고, 스트림에서 데이터를 읽을 수 있다.
 * 연결하고자 하는 device에 따라 다양한 스트림이 있다.
 * 
 * 2. 스트림의 특징
 * 1) 스트림은 FIFO 구조이다.
 * 2) 스트림은 단방향이다.
 * -자바에서 스트림은 읽기, 쓰기가 동시에 되지 않는다.
 * -읽기 쓰기가 필요하면 읽는 스트림과 쓰는 스트림을 하나씩 열어 사용
 * 3) 스트림은 지연될 수 있다.
 * -스트림은 넣어진 데이터가 처리되기 전까지는 스트림에 사용되는 스레드는 지연상태에 빠진다.
 * 따라서 네트워크내에는 데이터가 모두 전송되기 전까지 네트워크 스레드는 지연상태가 된다.
 * 
 * 3.스트림의 분류
 * 1) 스트림의 용도에 의한 분류
 * 	 -1차 스트림 : device에 직접적으로 연결되는 스트림, 기본스트림 = 노드스트림
 * 	 -2차 스트림 : device에 직접 연결되지 않음, 1차스트림과 연결을 통해서만 
 * 				장비에 연결될 수 있다.(부가적인 기능들을 가지고 있음)==보조스트림==필터스트림
 * 2) 데이터 전송 방향에 의한 분류
 * 	 - 입력 스트림 : 장치로부터 데이터를 읽어오는 스트림
 * 	 - 출력 스트림 : 장치로 데이터를 기록하는 스트림
 * 3) 데이터 전송 단위에 의한 분류 
 * 	 - 바이트 스트림 : 한byte 단위로 읽고, 쓸 수 있는 스트림
 *   - 문자 스트림 : 한 문자(2byte) 단위로 읽고, 쓸 수 있는 스트림 
 * 4.File class == 탐색기와 같은 역할
 * 	 - File 클래스는 파일, 디렉토리의 등록정보를 표현하는 클래스
 * 	 - File 클래스는 실제 파일의 내용을 포함하지 않는다.
 *   - File객체는 실제 파일의 존재여부와 상관없이 생성된다.
 *   
 * 
 * DataInputStream/DataOutputStream :
 * 바이트 스트림으로부터 자바 기본 자료형 Data를 읽는다 / 기본자료형을 바이트 스트림으로 출력한다.
 * 특정 데이터 타입과 포맷을 유지한 채 데이터를 기록하고 읽어 올 수 있는 스트림
 * 특정 데이터 타입과 포맷에 맞게 읽고 쓸 수 있는 readBoolean(),
 * wirteBoolean(boolean v), readInt, WriteInt(int v), readUTF(),writeUTF(String s)등의 메소드 제공
 * 
 * 생성자
 * DataInputStream(InputStream stream)/DataOutputStream(OutputStream stream)
*/
public class DataOutputStreamEx {

	public static void main(String[] args) {
		//DataOutputStream은 기본자료형타입 그대로 스트림을  통해서 기록 할 수 있다.
		//1차스트림이거나 아니기 때문에 다른 스트림을 이용 해서 device 와 연결 될 수 있다.(필터=보조스트림)
		DataOutputStream dos = null;
		FileOutputStream fos = null;

		try {
			//DataOutputStream과 연결된 FileOutputStream객체생성
			fos = new FileOutputStream("src/java221115/test.txt");
			//기본 자료형의 타입을 유지한채 기록할 수 있는
			//DataOutputStream 객체 생성
			dos = new DataOutputStream(fos);
			int i = 10;
			double d = 3.14;
			String s = "JAVA 프로그램";
			//DataOutputStream은 기본자료형별로 write메소드가 존재.
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				try {
					if (dos != null)
						dos.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}//finally

	}

}
