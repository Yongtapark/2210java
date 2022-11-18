package java221118;


public class MyFunctionalInterfaceExample4 {

	public static void main(String[] args) {
		UsingThis usingthis = new UsingThis();
		UsingThis.Inner inner =usingthis.new Inner();//유징디스 객체의 이너 객체 소환
		inner.method();
		
		//UsingThis usingthis2 =new UsingThis(usingthis2.new Inner());
	}

}
interface FunctionalInterface4 {
	public void method();
}

class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerField = 20;

		void method() {
			FunctionalInterface4 fi = () -> {
				System.out.println("outterField :" + outterField);
				System.out.println("outterField :" + UsingThis.this.outterField);

				System.out.println("innerField :" + innerField);
				System.out.println("innerField :" + this.innerField + "\n");
			};
			fi.method();
		}
	}
}