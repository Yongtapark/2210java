package java221116;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;

import java221104.Calender;

public class SawonProcess2 {
	public static void main(String[] args) {
		// sawon.txt 파일 읽어오기
		String fileName = "src/java221116/sawon.txt";
		// sawonResult.txt 저장하기
		String fileName2 = "src/java221116/sawonResult.txt";

		try {
			FileReader fi = new FileReader(fileName);
			FileWriter fw = new FileWriter(fileName2);
			BufferedReader br = new BufferedReader(fi);
			PrintWriter pw = new PrintWriter(fw);
			
			
			while(true) {
				String line= br.readLine();
				if(line==null) {
					break;
				}
				String str[]=line.split(",");
				String name=str[0];
				int total=0;
				String c= "  ";
				
				for(int i=1;i<str.length;i++) {
					total+=Integer.parseInt(str[i]);
					c+=str[i]+"   ";
				}
				double avg = total / 4.;
				pw.println(name + " " + c + "  " + total + "   " + avg);
				pw.println("-----------------------------------------------");
			}

			pw.flush();
			br.close();

			pw.close();
			fw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
