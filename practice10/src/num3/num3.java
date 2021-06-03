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
	Point p1 = new Point(0,0); // 시작점
	Point p2 = new Point(0,0);; // 끝점
	
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
		num3 win = new num3("마우스를 누르고 이용한 후 놓아 보세요");
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.magenta);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	class Point{ // int값 x, y를 가지는 클래스 
		int x;
		int y ;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	class MouseMotion extends MouseAdapter{
		public void mousePressed(MouseEvent e) { // 드래그 시작
			p1 = new Point(e.getX(),e.getY()); // 시작 점 저장
		}
		public void mouseReleased(MouseEvent e) { // 드래그 끝
			p2 = new Point(e.getX(),e.getY()); // 끝 점 저장
			repaint();
		}
	}

}
