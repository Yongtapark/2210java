package java221109;

public class ExitExample {

	public static void main(String[] args) {
		//보안관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status !=5) {
					throw new SecurityException();
				}
			}
		});

		for(int i=0; i<10; i++) {
			//i값 출력
			System.out.println(i);
			try {
				//jvm 종료 요청
				System.exit(i);
			}catch(SecurityException e) {}
		}
	}

}
