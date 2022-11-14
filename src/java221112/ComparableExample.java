package java221112;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> set=new TreeSet<Person>();
		
		set.add(new Person("홍길동",45));
		set.add(new Person("김자바",25));
		set.add(new Person("박지원",31));
		
		Iterator<Person> it= set.iterator();
		
		while(it.hasNext()) {
			Person person=it.next();
			System.out.println(person.name + ": "+person.age);
		}
		

	}

}
