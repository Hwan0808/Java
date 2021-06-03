import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;


public class CalcFrame extends JFrame implements ActionListener {
JLabel label;           // ���� ���â
boolean state = false; // ȭ�鿡 ǥ�õ� number �ڵ鷯
double num1, num2; 
double result;         // ���� ���
String func = "";     // ��� ������
String nInput = "";   // �������� ���� ������ ����

String btn[] = { "��", "C", "%", "x��", "7", "8", "9", "��", "4", "5", "6", "��", "1", "2", "3", "-", ".", "0", "=",
        "+" };        // ��ư �ȿ� �� �迭


public CalcFrame() {

    super("Calculator"); // title ����
    super.setResizable(true); // �������� ũ�⸦ ����ڰ� ����

    /*
     * JFrame : ���� ������ JPanel : ���� ������ JLabel : ����� �����ϴ� ������Ʈ
     */

    // ��� â GUI
    label = new JLabel("0", JLabel.RIGHT); // ("ùȭ�� ��µ� ��", ��ġ)

    JPanel mainView = new JPanel();
    label.setFont(new Font("Serif", Font.BOLD, 50)); // Font ����
    label.setBackground(Color.WHITE); // ���â ���� ����
    label.setOpaque(true); // ������ �����ϱ� ���� ������ ����

    // ��ư â GUI
    JPanel btnView = new JPanel();

    btnView.setLayout(new GridLayout(5, 4, 2, 2)); // ��� ���� ������ ���̾ƿ� ���� (row, cols, ����, ����)

    JButton button[] = new JButton[btn.length]; // ��ư ����, �迭�� ���̸�ŭ ���� ������

    for (int i = 0; i < btn.length; i++) {
        button[i] = new JButton(btn[i]);
        button[i].setFont(new Font("Serif", Font.BOLD, 25)); // Font ����
        button[i].addActionListener(this); // �͸�Ŭ������ ��ư �̺�Ʈ �߰� ,�̺�Ʈ �������� ��ü�̹Ƿ� this�� ����

        if (i == 0 || i == 1 || i == 18)
            button[i].setForeground(Color.RED); // ��ɺ� �� ����
        if (i == 2 || i == 3 || i == 7 || i == 11 || i == 15 || i == 19)
            button[i].setForeground(Color.BLUE);

        btnView.add(button[i]);

    }

    // ������ ��ġ �� ����
    mainView.setLayout(new BorderLayout()); // �������� ���̾ƿ� ��ġ
    add(label, BorderLayout.CENTER); // ���â ��ġ
    add(btnView, BorderLayout.SOUTH); // ��ưâ ��ġ

    setBounds(100, 100, 300, 400); // �������� ũ�� ����
    setDefaultCloseOperation(EXIT_ON_CLOSE); // X��ư�� ������ ������ ����
    setVisible(true); // �������� ���̵��� ����

}

// ���콺 Ŭ���� ���� ����

@Override
public void actionPerformed(ActionEvent e) {

    String input = e.getActionCommand(); // �̺�Ʈ�� �߻���Ų ��ü�� ���ڿ��� �����ͼ� input�� ����

    if (input.equals("+")) {
        num1 = num2;  
        func = "+";
        nInput = ""; // �������� ���� ������ ����

    } else if (input.equals("-")) {
        num1 = num2;
        func = "-";
        nInput = "";

    } else if (input.equals("��")) {
        num1 = num2;
        func = "��";
        nInput = "";

    } else if (input.equals("��")) {
        num1 = num2;
        func = "��";
        nInput = "";

    } else if (input.equals("%")) {
        num1 = num2;
        func = "%";
        nInput = "";
        result = num1 / 100;
        label.setText(String.valueOf(result)); //������� ���ڿ��� ��ȯ�Ͽ� ���â�� ���
    }

    else if (input.equals("x��")) {
        num1 = num2;
        func = "x��";
        nInput = "";
        result = num1 * num1;
        label.setText(String.valueOf(result));
        state = true;

    } else if (input.equals("C")) {  // Clear
        nInput = "";
        num2 = 0;
        num1 = 0;
        label.setText("0");

                                         // substring(start, end) - start���� end ������ ���ڿ� �ڸ���
    } else if (input.equals("��")) {     // ���ʺ��� ���������� ���������� ��
        setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));

        if (getBackSpace().length() < 1) {  // �� �̻� ���� ���ڰ� ������, 0���� clear
            nInput = "";
            num2 = 0;
            num1 = 0;
            label.setText("0");
        }

    } else if (input.equals("=")) {
        if (func.equals("+")) {
            result = num1 + num2;
            label.setText(String.valueOf(result)); //������� ���ڿ��� ��ȯ�Ͽ� ���â�� ���
            state = true; // ��� ���� ���� �� ���� �Է��� ������ �� ȭ�鿡 ǥ�õ� ��� ���� �����.

        } else if (func.equals("-")) {
            result = num1 - num2;
            label.setText(String.valueOf(result));
            state = true;

        } else if (func.equals("��")) {
            result = num1 * num2;
            label.setText(String.valueOf(result));
            state = true;

        } else if (func.equals("��")) {
            result = num1 / num2;
            label.setText(String.valueOf(result));
            state = true;

        }

    } else {
        if (state) {
            label.setText("0");
            state = false;
            num1 = 0;
            num2 = 0;
            nInput = "";
        }

        nInput += e.getActionCommand();
        label.setText(nInput);
        num2 = Double.parseDouble(nInput); //���ڿ����� double�� ��

    }

}

private void setBackSpace(String bs) {
    label.setText(bs);
}

private String getBackSpace() {
    return label.getText();
  }

public static void main(String[] args) {
	
  CalcFrame win = new CalcFrame();

  
}



}
