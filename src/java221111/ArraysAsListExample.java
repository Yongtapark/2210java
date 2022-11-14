package java221111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1 =Arrays.asList("홍길동","신용권","김자바");
		for(String name:list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 =Arrays.asList(1,2,3);
		for(int inte:list2) {
			System.out.println(inte);
		}
		
		
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
		
		

	}

}
