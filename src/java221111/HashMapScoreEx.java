package java221111;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 *  Map : hashMap	:동기화x 속도 빠름, 멀티 스레드 환경이 아닐때 적용
 *  	  hashTable :동기화 o 속도 느림, 멀티 스레드 환경에서 적용
 *  둘다 정렬 x 
*/
public class HashMapScoreEx {

	public static void main(String[] args) {
		//사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore= new HashMap<String, Integer>();
		//5개의 점수 저장
		javaScore.put("한원선", 99);
		javaScore.put("한홍진", 97);
		javaScore.put("황기태", 34);
		javaScore.put("이영희", 98);
		javaScore.put("정원석", 70);
		
		System.out.println("HashMap의 요소 개수 :"+javaScore.size());
		//모든 사람의 점수 출력
		//javaScore에 들어 있는 모든 (key, value) 쌍 출력
		//key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys =javaScore.keySet();
		
		Iterator<String> it =keys.iterator();
		while(it.hasNext()) {
			String name=it.next();
			int score =javaScore.get(name);
			System.out.println(name+" : "+ score);
			
		}

	}

}
