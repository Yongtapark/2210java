package java221111;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[]args) {
		List<Board> list=new Vector<Board>();
		
		list.add(new Board("제목1","내용1","저자1"));
		list.add(new Board("제목2","내용2","저자2"));
		list.add(new Board("제목3","내용3","저자3"));
		list.add(new Board("제목4","내용4","저자4"));
		list.add(new Board("제목5","내용5","저자5"));
		
		list.remove(2);//
		list.remove(3);
		
		
		
	
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
