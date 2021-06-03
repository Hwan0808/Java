package num9;

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class num9 extends JFrame {

	public num9(String title) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(420,250);
		setLayout(new GridLayout(2,4,10,20));
		
		JButton btn1 = new JButton("1"); 
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");

		JPanel yellow = new JPanel();
		JPanel pink = new JPanel();
		JPanel green = new JPanel();
		JPanel blue = new JPanel();

		yellow.setBackground(Color.yellow);
		pink.setBackground(Color.pink);
		green.setBackground(Color.green);
		blue.setBackground(Color.blue);
		
		add(btn1);
		add(yellow); 
		add(btn2); 
		add(pink);
		add(green);
		add(btn3); 
		add(blue);
		add(btn4); 
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		num9 win = new num9("Grid Button");
	}

}
