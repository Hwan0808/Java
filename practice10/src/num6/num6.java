package num6;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class num6 extends JFrame implements MouseMotionListener{

	private static final long serialVersionUID = 1L;
	Point p = new Point(0,0); //
	public num6(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseMotionListener(this);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) { 
		g.drawString("*", p.x, p.y);
	}
	public static void main(String[] args) {
		num6 win = new num6("마우스를 누르고 글씨를 써 보세요.");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		p = new Point(e.getX(), e.getY());
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	class Point{ // int값 x, y를 가지는 클래스 
		int x;
		int y ;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
}