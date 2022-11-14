package java221110;

import java.util.Iterator;
import java.util.Vector;

public class test1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.add("강희원");
		v.add("김동기");
		v.add("김민창");
		v.add("김수진");
		v.add("김수현");
		v.add("김운용");
		v.add("김재현");
		v.add("박종봉");
		v.add("박종성");
		v.add("심정훈");
		v.add("안원균");
		v.add("유희진");
		v.add("윤서빈");
		v.add("이문현");
		v.add("이예인");
		v.add("최지은");
		v.add("하도형");
		v.add("한철진");
		
		System.out.println("----우리반 학생들----");
		System.out.println("번호   이름");
		System.out.println("------------------");
		System.out.println("전체인원 수 : "+v.size()+"명");
		System.out.println();

		for(int i=0; i<v.size();i++) {
			String name =v.get(i);
			System.out.printf("%2d번   %s\n",i,name);
		}
		
	}

}
