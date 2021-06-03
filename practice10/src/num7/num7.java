package num7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class num7 extends JFrame implements ActionListener{
	
	public num7(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setTitle(title);
		settingMenu();
		setVisible(true);
	}
	public void settingMenu() {

		JMenu mainMenu = new JMenu("ÁÖ¸Þ´º");
		JMenu subMenu = new JMenu("¹ÙÅÁ»ö»ó");
		JMenuItem yellowItem = new JMenuItem("³ë¶û");
		yellowItem.addActionListener(this);
		JMenuItem redItem = new JMenuItem("»¡°­");
		redItem.addActionListener(this);
		JMenuItem grayItem =new JMenuItem("È¸»ö");
		grayItem.addActionListener(this);
		
		subMenu.add(yellowItem);
		subMenu.add(redItem);
		subMenu.add(grayItem);
		
		mainMenu.add(subMenu);
		JMenuBar menubar = new JMenuBar();
		menubar.add(mainMenu);
		setJMenuBar(menubar);
	}
	public static void main(String[] args) {
		num7 win = new num7("¸Þ´ºÃ³¸®");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		switch (str) {
		case "³ë¶û":
			getContentPane().setBackground(Color.yellow);
			break;
		case "»¡°­":
			getContentPane().setBackground(Color.red);
			break;
		case "È¸»ö":
			getContentPane().setBackground(Color.gray);
			break;
		default:
			break;
		}
	}

}