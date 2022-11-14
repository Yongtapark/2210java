package java221111;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	static void fx(List list) {
		for(int i=0; i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
	}
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		ArrayListExample a=new ArrayListExample();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("Database");
		list.add("Service");
		list.add("BATIS");
		
		int size= list.size();
		System.out.println("총 객체수 :"+size);
		
		String skill= list.get(2);
		System.out.println("2 :"+skill);
		System.out.println();
		
		fx(list);
		
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("BATIS");
		
		fx(list);
		
		

	}
	
	
	}


