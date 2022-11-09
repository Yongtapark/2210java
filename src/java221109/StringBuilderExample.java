package java221109;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		sb.append("java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length =sb.length();
		System.out.println("총 문자수 : "+length);
		
		String result= sb.toString();
		System.out.println(result);
				

	}

}
