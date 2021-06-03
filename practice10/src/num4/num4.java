package num4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;


public class num4 extends JFrame implements MouseInputListener{
	private static final long serialVersionUID = 1L;
	Point p1 = new Point(0,0); // 시작점
	Point p2 = new Point(0,0);; // 끝점
	public num4(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseMotionListener(this); // 모션리스너 등록
		addMouseListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		num4 win = new num4("마우스를 누르고 이동한 후 놓아 보세요.");
	}
	class Point{ // int 값 x, y를 가지는 클래스 
		int x;
		int y ;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	
	@Override
	public void paint(Graphics g) { 
		super.paint(g);
		g.setColor(Color.magenta);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		getGraphics().clearRect(0, 0, 500, 200); // 화면 초기화
		p1 = new Point(e.getX(),e.getY()); // 시작 점 저장
		setTitle("시작점 : ("+e.getX()+", "+e.getY()+")");
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		setTitle("끝점 : ("+e.getX()+", "+e.getY()+")");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		setTitle("중간점 : ("+e.getX()+", "+e.getY()+")");
		p2 = new Point(e.getX(),e.getY()); // 중간 점 저장
		repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
}