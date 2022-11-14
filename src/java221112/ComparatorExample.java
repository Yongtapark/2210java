package java221112;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		TreeSet<Fruit> treeset=new TreeSet<Fruit>(new DescendingComparator());
		treeset.add(new Fruit("포도",3000));
		treeset.add(new Fruit("수박",13000));
		treeset.add(new Fruit("딸기",6000));
		Iterator<Fruit> it =treeset.iterator();
		while(it.hasNext()) {
			Fruit fruit=it.next();
			System.out.println(fruit.name+" :"+fruit.price);
		}

	}

}
