package java221118;

import javax.swing.JFrame;

/*
 * JFrame:
 * 스윙의 JFrame은 AWT의 Frame과 달리 좀 복잡한 구조로 되어있다. 프레임자체로 구성되어 있는것이
 * 아니라 그 안에 4개의 페인(pane)이 층으로 구성되어 있다.
 * 1. JRootPane : 실질적인 윈도우 기능을 수행하는 경량의 컨테이너이다.
 * 				  모든 윈도우들의 동작이나 사용방법들이 같아지고, 다른 컴포넌트들과
 * 			 	  잘 조화가 될 수 있도록 도와주기 때문이다.
 * 				  GlassPane과 LayerPane으로 구성되어 있고,
 * 				  LayeredPane은 JMenuBar,ContentPane을 포함한다.
 * 1.1.GlassPane: 기본적으로 숨겨진 상태로 되어있다. 다른 패널 위에 존재하는 패널이다.
 * 				  주로 마우스 이벤트를 처리하기 위해 가장 먼저 루트페인에 추가된다(componet)
 * 1.2LayeredPane:루트 페인에 대해 레이어를 할 수 있도록 여러 층의 패널을 포함 할 수 있는
 * 				  패널로 여러 컴포넌트를 서로 오버랩(컴포넌트위에 다른 컴포넌트를 붙이는 작업)
 * 				  할 수 있도록 한다.
 * 				  윗부분은 JMenuBar, 아랫부분은 ContentPane으로 이루어져 있다.
 * 1.2.1 ContentPane: 일반적인 컴포넌트를 가질 수 있는 패널. 프레임 객체의 getContentPanme()
 * 					을 이용해서 얻을 수 있다.(메뉴를 제외한 모든 GUI 컴포넌트들을 부착하는 공간)
 * 1.2.2 JMenuBar : 윈도우의 메뉴를 제공하는 역할로 생략이 가능하다.
 *    				JMenu, JMenuItem등을 이용해서 메뉴를 구성하여 setJMenuBar()를
 *    				이용해서 등록 할 수 있다. 
*/
public class MyFrame extends JFrame{
	MyFrame(){
		setTitle("첫번째 프레임");
		setSize(300,300);//크기만
		setLocation(500,500);
		//setBounds(200,200,500,500);//위치:x,y,크기:x,y 둘다 한번에
		//pack(); //component의 크기 만큼 잡힘.
		setVisible(true); //이게 있어야 화면에 창이 보임
		System.out.println("제목: "+getTitle()); //창 이름을 콘솔장ㅇㅔ표시
	}
	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		

	}

}
