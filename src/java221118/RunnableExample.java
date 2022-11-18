package java221118;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = () ->{//: 원래 있는 기본 api 
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		
		
		Thread thread = new Thread(runnable);  // 아래와같이도 가능. 
		
//		Thread thread =new Thread(()->{//Runnable의 메소드가 run 밖에 없기 때문에 가능
//			for (int i=0; i<10; i++) {
//				System.out.println(i);
//			}
//		});
		
		thread.start();//thread의 의미가 무엇인지 질문 : 원래 있는 기본 api

	}

}
