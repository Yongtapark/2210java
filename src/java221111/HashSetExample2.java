package java221111;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set=new HashSet<Member>();
		
		set.add(new Member("홍길동",1)); //내용은 같은데 주소가 다르면 1.hashCode값 맞추고
		set.add(new Member("홍길동",1)); //2.equals()로 내용 비교// 1,2번이 둘다 맞으면 같은값이다.
		
		System.out.println("총 객체 수  :"+set.size());
			
		

	}

}
