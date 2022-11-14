package java221112;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				findClass();
			}catch(ClassNotFoundException e) {
				System.out.println(e.getLocalizedMessage()+"클래스가 존재하지 않음");
			}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz =Class.forName("java.lang.String2");
	}

}
