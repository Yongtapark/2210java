package java221116;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

import java221104.Calender;

public class SawonProcess {
	public static void main(String[] args) {
		// sawon.txt 파일 읽어오기
		String fileName = "src/java221116/sawon.txt";
		// sawonResult.txt 저장하기
		String fileName2 = "src/java221116/sawonResult.txt";

		try {
			// 1.파일에서 읽어오기(문자를 읽어오는 파일 객체 생성)
			FileReader fr = new FileReader(fileName);
			// 2.버퍼에서 읽기
			BufferedReader br = new BufferedReader(fr);// sawon.txt
			// 3.파일에 출력(저장)하기
			FileWriter fw = new FileWriter(fileName2);
			// 4. PrintWriter 객체 생성
			PrintWriter pw = new PrintWriter(fw);// sawonResult.txt
			// 5.Calender 객체 얻어오기
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int day = cal.get(Calendar.DATE);

			String Line = "";// sawonResult.txt 파일 읽어와서 담을 변수
			// 타이틀만 sawonResult.txt 파일에 저장
			pw.printf("        %s년 신입사원 평가 점수\n", year);
			pw.println("-------------------------------");
			pw.println("          평가일:" + year + "년" + (month + 1) + "월" + day + "일");
			pw.println("이름  java  jquery  html5  css3  total  avg");
			pw.print("------------------------------------------");

			// ---------------------반복해서 파일 읽어오기-------------------------
			while (true) {
				String line = "";
				line = br.readLine();// String 형 (레코드 =한줄 전체읽어옴)
				if (line == null)
					break;
				String str[] = line.split(",");
				String name = str[0]; // 이름
				int total = 0;// 합계
				String c = "  "; // 과목의 점수 저장

				for (int i = 1; i < str.length; i++) {
					total += Integer.parseInt(str[i]);
					c += str[i] + "    ";// 1,2,3,4 과목 저장
					
				}
				double avg = total / 4.;
				pw.println("\n"+name + " " + c + "  " + total + "   " + avg);
				pw.print("------------------------------------------");
				

				// 화면에 출력

				System.out.println(name + " " + c + " " + total + " " + avg + "\n");
				System.out.println("---------------------------------------------");

			}
			pw.flush();
			br.close();
			fr.close();
			pw.close();
			fw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
