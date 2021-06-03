package num1;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class num1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JPanel center = new JPanel();
	JPanel south = new JPanel();

	JButton yellow = new JButton("³ë¶û");
	JButton red = new JButton("»¡°­");
	
	public num1(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(300,200);
		setLayout(new BorderLayout());
		
		add(center,BorderLayout.CENTER);
		
		yellow.addActionListener(this);
		red.addActionListener(this);
		
		south.setLayout(new GridLayout(1,2));
		south.add(red);
		south.add(yellow);
		
		add(south,BorderLayout.SOUTH);
	
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String str = e.getActionCommand();
		
		if(str.equals("»¡°­")) {
			center.setBackground(Color.red);
		} else if(str.equals("³ë¶û")) {
			center.setBackground(Color.yellow);
		}
		
	}

	public static void main(String[] args) {
		num1 win = new num1("¹öÆ° ¾×¼Ç ÀÌº¥Æ® Ã³¸®");
	}
}


