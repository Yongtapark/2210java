package java221111;

import java.util.List;
import java.util.Stack;


public class test1 {
	static final String[] Collors= 	{"빨강","주황","노랑","초록","파랑","남색","보라"};
	public static void main(String[] args) {
		List<String> list =new Stack<String>();
		for(int i=0; i<Collors.length;i++) {
			list.add(Collors[i]);
			System.out.print("\t"+list.get(i));
		}
		System.out.println();
		list.remove(1);
		list.remove("노랑");
		
		for(int i=0; i<list.size();i++) {
			System.out.print("\t"+list.get(i));
		}
			
		
		
		
		
		
		
		
	

	}

}
