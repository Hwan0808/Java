package num7;

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class num7 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public num7(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,300);
		setLayout(new BorderLayout());
		
		JPanel northJPanel = new JPanel();
		northJPanel.setLayout(new BorderLayout());
		northJPanel.add(new JLabel("�� ��:"),BorderLayout.WEST);
		JTextField tf = new JTextField();
		tf.setText("2012. 7.22");
		tf.setPreferredSize(new Dimension(345, 20));
		northJPanel.add(tf,BorderLayout.EAST);
		
		add(northJPanel,BorderLayout.NORTH);
		add(new JLabel("�޸�:"),BorderLayout.WEST);
		JTextArea jt = new JTextArea(12,30);
		jt.setText("�޸� ���⼼��");
		
		JScrollPane js = new JScrollPane(jt);
		js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // �׻� ���� ��ũ�ѹ� ǥ��
		js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // �׻� ���� ��ũ�ѹ� ǥ��
		
		add(js,BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		num7 win = new num7("������ �ִ� �ؽ�Ʈ�ʵ�� �ؽ�Ʈ����");
	}

}
