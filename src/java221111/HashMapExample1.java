package java221111;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap<String,Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("객체 수: "+map.size());
		System.out.println("홍길동 :"+map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet =map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key =it.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println();
		
		map.remove("홍길동");
		
		System.out.println("객체 수 :"+map.size());
		
		Set<Map.Entry<String, Integer>>entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer>entry = entryIterator.next();
			String key =entry.getKey();
			Integer value =entry.getValue();
			System.out.println(key+":"+value);
		}
			map.clear();
			System.out.println("객체 수 :"+map.size());
		
	
	}

}
