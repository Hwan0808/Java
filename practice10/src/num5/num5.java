package num5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputListener;


public class num5 extends JFrame implements MouseInputListener{
	JLabel label;
	public num5(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		addMouseMotionListener(this); // 모션리스너 등록
		addMouseListener(this);
		label = new JLabel("No Mouse Event");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		num5 win = new num5("MouseListener와 MouseMotionListener 예제");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		getContentPane().setBackground(Color.CYAN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		getContentPane().setBackground(Color.YELLOW);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setText("mousePressed ("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setText("mouseReleased ("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		label.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}

}