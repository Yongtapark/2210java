package java221108;

import java.util.Objects;

public class HashCodeExample {
	static class Student {
		int sno;
		String name;

		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {//같은 sno,name이면 같은 해쉬코드를 리턴
			return Objects.hash(sno,name);
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));

	}

}
