package java221111;
class GStack<T>{//제네릭 : 타입을 일반화
	int tos;
	Object []stck;
	public GStack() {
		tos=0;
		stck=new Object[10];
	}
	public void push(T item) {
		if(tos ==10)
			return; //full이면 돌아가기
		stck[tos] =item;//full이 아니면 삽입
		tos++;//삽입하고 자리위치 1 증가
	}
	public T pop() {
		if(tos==0)
			return null;//비어있으면 null을 주고 돌아가기
		tos--;//비어있지 않으면 자리 위치 하나 빼기
		return (T)stck[tos];// 값 꺼내기==삭제하기
	}
}
public class Mystack {

	public static void main(String[] args) {
		GStack<String> stringStack =new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop());

	}

}
