package java221111;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("JAVA");
		set.add("JDBC");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		System.out.println("총 객체 수 : " + set.size());

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println("\t"+element);
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체 수 : " + set.size());

		Iterator<String> sit = set.iterator();
		while (sit.hasNext()) {
			String element = sit.next();
			System.out.println("\t"+element);

		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
