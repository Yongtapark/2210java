package java221109;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args)throws IOException {
		byte[] bytes =new byte[100];//읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.print("입력");
		int readByteNo = System.in.read(bytes);
		//배열에 읽은바이트를 저장하고 읽은 바이트 수를 입력
		
		String str=new String(bytes,0,readByteNo-2);// (/r),(/n) 2개를 빼줘야 한다.
		System.out.println(str);

	}

}
