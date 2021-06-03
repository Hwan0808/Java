package num6;
import javax.swing.*; // ���̺귯�� �߰�
import java.awt.*;

public class num6 extends JFrame {

	private static final long SerialVersionUID=1L;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7; // ��ư ���� �� ���� ����
	
	public num6(String title) { 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ��ư Ŭ���� ������ ���� �ǵ��� ����
		setSize(370,240); // ������ ������ ����
		setTitle(title); // ������ �̸� ����
		
		setLayout(new BorderLayout());
		
		JPanel Up = new JPanel(); // ��� �г� 1�� 4���� ���� �׸��� ���̾ƿ��� �����Ͽ� �� ��ư�� �����Ѵ�. 
		Up.setLayout(new GridLayout(1,4)); 
		btn1 = new JButton("Ű�е�");
		btn2 = new JButton("�ֱٱ��");
		btn3 = new JButton("���ã��");
		btn4 = new JButton("����ó");
		Up.add(btn1); Up.add(btn2); Up.add(btn3); Up.add(btn4); // �гο� ��ư �߰�
		
		JPanel Center = new JPanel(); // �ߴ� �г� �ؽ�Ʈ �ʵ带 �������� �г��� ����� �ؽ�Ʈ�� ��ġ�� �������� �����Ѵ�.
		Center.setLayout(new BorderLayout());
		JTextField text = new JTextField();
		Center.add(text,"North");
				
		JPanel sub = new JPanel(); // �ߴ� �гξȿ� �� 4�� 3���� ���� �׸��� ���̾ƿ��� �����Ͽ� �� 12���� ��ư�� �����Ѵ�. 
		sub.setLayout(new GridLayout(4,3));

		for(int i = 1; i<=9; i++) {
			 sub.add(new JButton(i+""));
		} // �ڵ带 �����ϰ� �ϱ� ���� �ݺ����� ����ߴ�.

		btn5 = new JButton("*"); // ������ ��ư�� �����Ѵ�.
		btn6 = new JButton("0");
		btn7 = new JButton("#");
		sub.add(btn5); sub.add(btn6); sub.add(btn7); // �гο� ��ư �߰�
		
		Center.add(sub,BorderLayout.CENTER); // �ߴ� �гο� �ؽ�Ʈ �ʵ带 ���ڷ� �Ͽ� �߰��Ѵ�.

		JPanel Down = new JPanel(); // �ϴ� �г��� �����ϰ� ��� �гΰ� ���� �������� ��ư�� �����Ѵ�.
		Down.setLayout(new GridLayout(1,2));
		btn5 = new JButton("��ȭ�ɱ�");
		btn6 = new JButton("����");
		btn7 = new JButton("�����");
		Down.add(btn5); Down.add(btn6); Down.add(btn7); // �гο� ��ư �߰�
		
		// �����ӿ� �� �гε��� ���,�ߴ�,�ϴܿ� �߰��Ѵ�.
		add(Up,BorderLayout.NORTH);
		add(Center,BorderLayout.CENTER);
		add(Down,BorderLayout.SOUTH); 
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		num6 win = new num6("���̾� �е�"); // ��ü�� �����Ͽ� ����Ѵ�.
	}

}
