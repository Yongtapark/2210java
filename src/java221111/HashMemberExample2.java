package java221111;

import java.util.HashMap;
import java.util.Map;

public class HashMemberExample2 {

	public static void main(String[] args) {
		Map<Student2,Integer> hm =new HashMap<Student2,Integer>();
		
		hm.put(new Student2(1,"홍길동"),95);
		hm.put(new Student2(1,"홍길동"),95);
		
		System.out.println("총 Entry 수 :"+hm.size());

	}

}
