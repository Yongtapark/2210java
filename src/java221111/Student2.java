package java221111;

 public class Student2 {
	int sno;
	String name;
	
	public Student2(int sno, String name){
		this.name=name;
		this.sno=sno;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 student =(Student2) obj;
			return(sno==student.sno)&&(name.equals(student.name));
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		System.out.println(sno+name.hashCode());
		return sno+name.hashCode();
		
	}
}
