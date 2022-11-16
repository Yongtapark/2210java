package java221116;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * -PrintStream
 *  .모든 자료형을 출력 할 수 있는 print(), println()메소드가 오버로딩 되어있다.
 *  .프로그램이 시작되면 장치와 연결된 출력 스트림인 System.in, System.out,
 *   System.err 객체가 PrintStream 객체이다.
 *  .다른 스트림과는 다르게 플러쉬기능을 자동으로 처리할 수 있는 
 *   생성자를 가지고 있다.
 *  .모든 메소드는 예외처리를 하지 않는다.
 *  
 *  -PrintWriter
 *  .PrintWriter는 다른 스트림과 다르게 바이트 출력 스트림과 문자출력
 *   스트림을 가지고 객체를 생성 할 수 있는 클래스이다.
 *  .자동 플러쉬기능(auto flush)을 가지고 있다.
 *  .PrintWriter 클래스의 생성자는 FileNotFoundException예외를 
 *   발생하기 때문에 반드시 예외처리를 해야한다.
*/
public class PrintStream_01 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos= null;
		PrintStream ps=null;
		
		try {
			fos=new FileOutputStream("src/java221116/test.txt");
			bos=new BufferedOutputStream(fos);
			ps=new PrintStream(bos,true);//(OutputStream out, boolean autoFlush)
			ps.println("홍길동 :"	);
			ps.println(2022);
			ps.println(true);
			ps.println('a');
			
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			try {
				if(fos !=null) fos.close();
				if(bos !=null) bos.close();
				if(ps !=null) ps.close();
			}catch (Exception e) {
				e.getStackTrace();
			}
		}

	}

}
