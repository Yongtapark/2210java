package java221111;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		//Iterator 객체 리턴
		Iterator<String> iterator =l.iterator();
		//Iterator 객체에 요소가 있을 때까지 반복
		while(iterator.hasNext()) {
			String e= iterator.next();//다음 요소 리턴
			String separator;
			if(iterator.hasNext())
				separator = "->";//마지막 요소가 아니면 -> 출력
			else
				separator ="\n";//마지막 요소이면 줄바꿈
			System.out.print(e+separator);
		}
	}

	public static void main(String[] args) {
		//반 리스트 생성
		LinkedList<String> myList=new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("매트릭스");
		myList.add(2,"아바타");
		myList.add("스타워즈");
		myList.add(0,"터미네이터");
		
		System.out.println("정렬전 -----------");
		printList(myList);//요소출력
		
		System.out.println("\n정렬 후----------");
		Collections.sort(myList);//요소 정렬
		printList(myList);//정렬된 요소 출력
		
		System.out.println("\n이분검색----------");//이분검색을 하려면 정렬이 필요하다
		int index =Collections.binarySearch(myList, "트랜스포머")+1;
		System.out.println("트랜스포머는 "+index+"번째 요소입니다.");
		
		System.out.println("\n역순출력-----------");
		Collections.reverse(myList);
		printList(myList);
	}

}
