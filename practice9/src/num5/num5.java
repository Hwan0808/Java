package num5;

import java.awt.*;
import javax.swing.*;

public class num5 extends JFrame {

	private static final long SerialVersionUID=1L;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
	
	public num5(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(370,240);
		setTitle(title);
		
		JPanel Up = new JPanel();
		Up.setLayout(new GridLayout(1,4));	
		btn1 = new JButton("키패드");
		btn2 = new JButton("최근기록");
		btn3 = new JButton("즐겨찾기");
		btn4 = new JButton("연락처");
		Up.add(btn1); Up.add(btn2); Up.add(btn3); Up.add(btn4);
		
		JPanel Down = new JPanel();
		Down.setLayout(new GridLayout(1,2));
		btn5 = new JButton("전화걸기");
		btn6 = new JButton("이전");
		btn7 = new JButton("지우기");
		Down.add(btn5); Down.add(btn6); Down.add(btn7);
		
		add(Up,BorderLayout.NORTH);
		add(Down,BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		num5 win = new num5("다이얼 패드를 위한 기본 버튼");
	}

}
