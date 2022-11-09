package innerClass;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/*4. Anonymous Class :클래스 선언과 객체의 생성을 동시에 하는 이름이 없는
	클래스 (일회용:한번만 사용하고 버려지는 객체를 사용할 때 유용하게 쓰인다.swing에서 많이씀
*/
public class Anonymous extends JFrame {

	public static void main(String[] args) {
		// 프레임 객체 생성
		Anonymous t = new Anonymous();
		// 프레임 제목
		t.setTitle("Anonymous Class train...");
		// 버튼 객체 생성
		JButton btn = new JButton("버튼");
		// 프레임에 버튼 붙이기
		t.add(btn);
		// 프레임 크기 설정
		t.setSize(500, 300);// 화면 가로*세로 크기
		// 프레임 화면에 x,y 위치
		t.setLocation(100, 100);
		t.setVisible(true);

		// 1인치-->2.54cm
		// 이벤트 발생
		// 버튼을 클릭시 이벤트 처리할 처리기(이벤트핸들러)연결
		// 이벤트 발생시킬 소스.이벤트 연결(이벤트 처리기);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				// 이벤트를 발생한 버튼에 있는 글자를 대입
				String select = e.getActionCommand();// 버튼의 글자 가져오기
				if (select.equals("버튼")) {
					System.out.println(select + "***");
					// 시스템 종료 == 프로그램 종료0 또는 다른 정수
					System.exit(0);
				}
			}
		});// btn
		t.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("닫을까요?");
				System.exit(0);

			};
		});
	}

}
