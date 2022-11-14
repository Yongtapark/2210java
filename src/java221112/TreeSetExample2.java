package java221112;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<Integer>();
		
		scores.add(new Integer(98));
		scores.add(new Integer(95));
		scores.add(new Integer(87));
		scores.add(new Integer(80));
		scores.add(new Integer(75));
		
		NavigableSet<Integer> decendingSet=scores.descendingSet();
		for(Integer score:decendingSet) {
			System.out.print(" "+score);
		}
		System.out.println();
		NavigableSet<Integer> ascendingSet=decendingSet.descendingSet();
		for(Integer score:ascendingSet) {
			System.out.print(" "+score);
		}
		

	}

}
