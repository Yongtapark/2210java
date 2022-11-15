package java221115;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test1 {
	public static void dir(String scr2) {

		File f1 = new File(scr2);

		String res;
		if (f1.isFile()) {
			res = "O";
		} else {
			res = "X";
		}

		String res2;
		if (f1.isFile()) {
			res2 = "X";
		} else {
			res2 = "O";
		}
		System.out.println("파일인지 " + res);
		System.out.println("디렉토리인지 " + res2);
		System.out.println("상대경로 :" + f1.getPath());
		System.out.println("절대경로 :" + f1.getAbsolutePath());
		System.out.println("디렉토리 혹은 파일의 이름 :" + f1.getName());
		System.out.println("파일의 길이 :" + f1.length());
		long t = f1.lastModified();
		System.out.printf("파일의 최종 수정한 날짜 : %tb %td %ta %tT\n", t, t, t, t);

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력");
		String scr = sc.next();
		dir(scr);
//
//		File f1 = new File(scr);
//
//		String res;
//		if (f1.isFile()) {
//			res = "O";
//		} else {
//			res = "X";
//		}
//
//		String res2;
//		if (f1.isFile()) {
//			res2 = "X";
//		} else {
//			res2 = "O";
//		}
//		System.out.println("파일인지 " + res);
//		System.out.println("디렉토리인지 " + res2);
//		System.out.println("상대경로 :" + f1.getPath());
//		System.out.println("절대경로 :" + f1.getAbsolutePath());
//		System.out.println("디렉토리 혹은 파일의 이름 :" + f1.getName());
//		System.out.println("파일의 길이 :" + f1.length());
//		long t = f1.lastModified();
//		System.out.printf("파일의 최종 수정한 날짜 : %tb %td %ta %tT\n", t, t, t, t);
	}
}
