package num3;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;


public class num3 extends JFrame {

	private static final long serialVersionUID = 1L;
	Point p1 = new Point(0,0); // ������
	Point p2 = new Point(0,0);; // ����
	
	public num3(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.addMouseListener(new MouseMotion());
		add(jp);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		num3 win = new num3("���콺�� ������ �̿��� �� ���� ������");
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.magenta);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	class Point{ // int�� x, y�� ������ Ŭ���� 
		int x;
		int y ;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	class MouseMotion extends MouseAdapter{
		public void mousePressed(MouseEvent e) { // �巡�� ����
			p1 = new Point(e.getX(),e.getY()); // ���� �� ����
		}
		public void mouseReleased(MouseEvent e) { // �巡�� ��
			p2 = new Point(e.getX(),e.getY()); // �� �� ����
			repaint();
		}
	}

}
