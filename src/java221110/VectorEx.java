package java221110;

import java.util.Iterator;
import java.util.Vector;

/*  ○ 자료
 	현실 세계로부터 단순한 관찰이나 측정을 통해 수집된
 	사실이나 개념의 값들 또는 그 값들의 집합.
 	
 ○ 자료구조
 	자료 처리를 위한 자료의 표현, 저장, 관계, 관리및
 	이용에 관한 방법 등의 개념을 이해하여 프로그램에 사용하고
 	컴퓨터에 의 처리될 때, 적절한 자료의 표현, 구성, 저장 및
 	처리를 위한 알고리즘의 작성 및 선택과 이용 방법을 연구하는 분야.

  
   collection 인터페이스 : list(중복가능, 정렬 가능)-ArrayList,vector,stack,queue,linkedlist
                        set(중복불가, 정렬불가)-hashSet
   Map인터페이스(키,값) 한쌍:(키 중복불가능, 값 중복가능, 정렬불가) HashMap,HashTable 
   
   Enumeration 과 Iterator 라는 인터페이스
   
   컬렉션 프레임워크(Collection Framework)에는
   Enumeration과 Iterator 라는 인터페이스가 있다.
   사전적인 의미로는 반복, 순환 등의 의미를 가지고 있으며
   어떤 객체들의 모임이 있을 때
   이 객체들을 어떤 순수에 의해 하나씩 접근하여 사용하기 위한
   인터페이스라고 정리할 수 있다.
   
    - java.util.Enumeration<E> 인터페이스
      이 인터페이스는 단지 두개의 메소드만을 제공하며
      hasMoreElemets() 메소드를 통해 인터페이스 안에
      다음 요소가 있는지에 대한 질의를 한다.
      만약 true가 반환되었다면 다음 인덱스 요소가 존재한다는 의미이며
      nextElement() 메소드로 다음 요소를 꺼내어 사용하면 되는것이다.
      		
      		- 인터페이스(Interface)
 	  : 기본적으로 컬렉션에 필요한 데이터 관리 기능을 제공한다.
 	    예를 들어 list는 추가, 삭제, 검색 등의 기능을 제공하는
 	    컬렉션 인터페이스가 존재하며
 	    각 컬렉션마다 고유의 인터페이스가 정의되어 있다.
 	  
 	- 구현(Implementation)
 	  : 인터페이스를 구현한 클래스고 각 컬렉션을
 	    실제 어떤 자료구조를 이용하여 표현했느냐에 따라
 	    컬렉션의 종류가 달라진다.
 	    
 	- 알고리즘(Algorithms)
 	  : 각 컬렉션마다 유용하게 사용할수 있는 메소드를 의미한다.
      		
      
      ex) v 라는 벡터 자료구조에 저장된 모든 요소 출력
      for(Enumeration e = v.elements(); e.hasMoreElements;)
      {
       		System.out.println(e.nextElement());
      }
      
      - java.util.Iterator<E> 인터페이스
      Enumeration과 차이점은 단지 remove() 메소드가 추가된 것 뿐이다.
      hasNext()와 next 메소드는 이름만 다를뿐 Enumeration 인터페이스의 
      hasMoreElements()와 nextElement와 정확히 일치하는 기능을 한다.
      Enumeration 대신 Iterator를 JAVA2에서 추가하여 사용하는 이유는
      Enumeration 인터페이스는 집합 내에서 요소를 제거할 방법이
      없기 때문에 이를 보완하기 위해 나온것이 Iterator라고 할 수있다.
      
      hasNext() : 다음 위치에 요소(데이터)가 있으면 true를 반환한다.
      next()    : 다음 위치에 요소(데이터)를 반환한다.
      remove()  : 반복자(Iterator)에 의해 마지막 반환된 요소를 삭제한다.
*/                        
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> v= new Vector<Integer>(); //기본이 10칸
		
		v.add(5);//5삽입
		v.add(4); //4삽입
		v.add(-1); //-1 삽입
		
		//벡터 중간에 삽입하기
		v.add(2,100);//4와 -1 사이에 정수 100삽입
		
		System.out.println("벡터 내의 요소 객체 수: "+v.size());
		System.out.println("벡터의 현재 용량 :"+v.capacity());
		//모든 요소 정수 출력하기
		int sum=0;
		for(int i=0;i<v.size();i++) {
			
			int n=v.get(i);
			System.out.print(n+" ");
			sum+=n;
			
		}
		System.out.println("벡터의 정수의 합 : "+sum);
		
		System.out.println("---------Iterator(반복자) 이용하기------");
		//이더레이터(Iterator)를 통해 전체 출력
		//hasNext() : 다음 데이터 요소가 있는지 여부를 반환
		//next(); : 다음 데이터 요소수를 직접적으로 반환
		//vector, ArrayList, linkedList, Set과 같은 컬렉션에서 요소를 순차적으로
		//검색 할 때 편리하게 사용하는 Interator<E> 인터페이스이다.
		Iterator<Integer> it=v.iterator();
		int str;
		while(it.hasNext()) {
			str=it.next();
			System.out.print (str+" ");
			
		}
		
	}

}
