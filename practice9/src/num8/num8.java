package num8;

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class num8 extends JFrame {

	public num8(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,300);
		setLayout(new BorderLayout());
		
		String swing[] = {"javax.accesibility","javax.swing","javax.swing.border","javax.swing.plaf.basic","javax.swing.plaf.metal"};
		JList<String> pkg = new JList<String>(swing);
		
		JScrollPane sp = new JScrollPane(pkg);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		add(sp,BorderLayout.CENTER);
		
		String month[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox<String> cb = new JComboBox<String>(month);
		
		cb.setEditable(true);
		cb.setSelectedIndex(3);
		
		add(cb,BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		num8 win = new num8("목록 선택을 위한 컨트롤"); 
	}

}
