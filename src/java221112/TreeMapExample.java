package java221112;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> treemap =new TreeMap<Integer,String>();
		treemap.put(87, "홍길동");
		treemap.put(98, "이길수");
		treemap.put(75, "이동수");
		treemap.put(95, "방동순");
		treemap.put(80, "김자바");
		
		
		Map.Entry<Integer, String>entry=null;
		entry=treemap.firstEntry();
		System.out.println("제일 작은 수:"+entry.getKey()+"-"+entry.getValue());
		entry=treemap.lastEntry();
		System.out.println("제일 높은 수:"+entry.getKey()+"-"+entry.getValue());
		entry=treemap.lowerEntry(95);
		System.out.println("95점 아래 점수:"+entry.getKey()+"-"+entry.getValue());
		entry=treemap.higherEntry(85);
		System.out.println("85점 위에 점수:"+entry.getKey()+"-"+entry.getValue());
		entry=treemap.floorEntry(95);
		System.out.println("95점 이거나 아래 점수:"+entry.getKey()+"-"+entry.getValue());
		entry=treemap.ceilingEntry(85);
		System.out.println("85점 이거나 위에 점수:"+entry.getKey()+"-"+entry.getValue());
		
		while(!treemap.isEmpty()) {
		 entry =treemap.pollFirstEntry();
		 System.out.println(entry.getKey()+"-"+entry.getValue()+"(남은 수)" + treemap.size());
		
		}
	}

}
