package java221116;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SawonReader {

	public static void main(String[] args) throws IOException {
		String FileName = "src/java221116/sawon.txt";
		FileReader fi = null;
		BufferedReader br = null;

		try {
			fi = new FileReader(FileName);
			br = new BufferedReader(fi);
			int c = 0;
			String line = "";
//			while ((c = br.read()) != -1) {
//				System.out.print((char) c);
//			}
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				System.out.println((++c) + ":" + line);
			}

		} catch (Exception e) {
			e.getStackTrace();
		} finally {

			br.close();
			fi.close();

		}

	}

}
