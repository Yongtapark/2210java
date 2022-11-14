package java221110;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name=name;
	}
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return name;
}
}
