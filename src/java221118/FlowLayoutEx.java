package java221118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container contentPane =getContentPane();
		contentPane.setBackground(Color.BLUE);
		JButton jb=new JButton("add");//버튼 객체 생성
		JButton cal=new JButton("Calculate");
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		//add(new JButton("add"));
		add(jb);
		
		jb.setFont(new Font("굴림",Font.BOLD,50));//글꼴/크기
		jb.setBackground(Color.red);//칸의 색
		jb.setForeground(Color.green);//버튼 글자색
		add(new JButton("Sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(cal);
		cal.setFont(new Font("굴림",Font.ITALIC,20));
		cal.setBackground(Color.yellow);//칸의 색
		cal.setForeground(Color.gray);
		
		//add(new JButton("Calculate"));
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}
