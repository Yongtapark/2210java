package java221109;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//자동 Boxing
		Integer obj =100;
		//Wrapper 수동
		//Integer obj1=Integer.valueOf(100);
		
		System.out.println("value :"+obj.intValue());
		
		//대입 시 자동 Unboxing
		int value= obj;
		//Wrapper 수동
		//int value1=obj1.intValue();
		System.out.println("value: "+value);
		
		//연산 시 자동 Unboxing
		int result =obj+100;
		//Wrapper 수동
		//int result1=obj1.intValue()+100;
		System.out.println("result "+result);

	}

}
