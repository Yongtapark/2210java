package java221108;

public class SystemEnvExanple {

	public static void main(String[] args) {
	String javaHome = System.getenv("JAVA_HOME");
	System.out.println("JAVA_HONE : "+javaHome);
	
	String ClassPath = System.getenv("CLASSPATH");
	System.out.println("CLASSPATH : "+ClassPath);
	
	String Path = System.getenv("PATH");
	System.out.println("PATH : "+Path);

	}

}
