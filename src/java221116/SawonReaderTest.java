package java221116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.Calendar;

public class SawonReaderTest {

	public static void main(String[] args) throws IOException {
		String FileName = "src/java221116/sawon.txt";
		FileReader fi = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		BufferedReader in = null;

		try {

			fi = new FileReader(FileName);
			fw = new FileWriter("src/java221116/sawonResult.txt");
			pw = new PrintWriter(fw);
			in = new BufferedReader(fi);
			String c = "";

			pw.println("\t\t2022년 신입사원 평가 점수");
			pw.println("\t\t---------------------");
			Calendar today = Calendar.getInstance();
			pw.println("\t\t\t\t평가일: " + today.get(Calendar.YEAR) + "년" + today.get(Calendar.MONTH) + "월"
					+ today.get(Calendar.DATE) + "일");

			pw.println("------------------------------------");
			pw.println("이름  java  html5  css3  total  avg");
			pw.println("-------------------------------------");

			while ((c = in.readLine()) != null) {
				
				//pw.write(c + "\n");
				String[] per1 =c.split(",");
				pw.write((per1[0])+" ");
				
				for(int i=1; i<per1.length;i++) {
					pw.write(per1[i]+"   ");
					pw.write("\n------------------------------------\n");
				}

				pw.write("\n------------------------------------\n");

				
			}

			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {

		}

	}

}
