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
		btn1 = new JButton("Ű�е�");
		btn2 = new JButton("�ֱٱ��");
		btn3 = new JButton("���ã��");
		btn4 = new JButton("����ó");
		Up.add(btn1); Up.add(btn2); Up.add(btn3); Up.add(btn4);
		
		JPanel Down = new JPanel();
		Down.setLayout(new GridLayout(1,2));
		btn5 = new JButton("��ȭ�ɱ�");
		btn6 = new JButton("����");
		btn7 = new JButton("�����");
		Down.add(btn5); Down.add(btn6); Down.add(btn7);
		
		add(Up,BorderLayout.NORTH);
		add(Down,BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		num5 win = new num5("���̾� �е带 ���� �⺻ ��ư");
	}

}
