package java221116;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class SawonWriter {

	public static void main(String[] args) {
		String FileName="src/java221116/sawon.txt";
		FileReader fi =null;
		FileWriter fw =null;
		PrintWriter pw =null;
		
		
		try {
			//파일에서 읽어오기
			//(String fileName, boolean append)
			fw=new FileWriter(FileName,false);//추가 x true로하면 덮어씌워지는것이 아닌 밑에 목록이 추가
			//프린터 라이터 사용
			pw=new PrintWriter(fw);
			
			pw.println("홍길동,90,90,90,90");
			pw.println("홍길순,90,90,90,90");
			pw.println("고길동,90,90,90,90");
			System.out.println("sawon.txt에 저장되었습니다.");
			fw.close();
			pw.close();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
