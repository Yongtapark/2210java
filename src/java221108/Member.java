package java221108;

public class Member implements Cloneable {
	String id;
	String name;
	String password;
	int age;
	boolean adult;
	
	Member(String id, String name, String password, int age,boolean adult){
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
	}
	
	Member getMember() {
		Member cloned = null;
		try {
			cloned =(Member)clone();
		}catch (CloneNotSupportedException e) {}
		return cloned;
	}
	
}
