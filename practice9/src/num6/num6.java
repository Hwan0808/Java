package num6;
import javax.swing.*; // 라이브러리 추가
import java.awt.*;

public class num6 extends JFrame {

	private static final long SerialVersionUID=1L;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7; // 버튼 생성 할 변수 설정
	
	public num6(String title) { 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 버튼 클릭시 완전히 종료 되도록 구현
		setSize(370,240); // 프레임 사이즈 설정
		setTitle(title); // 프레임 이름 설정
		
		setLayout(new BorderLayout());
		
		JPanel Up = new JPanel(); // 상단 패널 1행 4열을 갖는 그리드 레이아웃을 설정하여 각 버튼을 삽입한다. 
		Up.setLayout(new GridLayout(1,4)); 
		btn1 = new JButton("키패드");
		btn2 = new JButton("최근기록");
		btn3 = new JButton("즐겨찾기");
		btn4 = new JButton("연락처");
		Up.add(btn1); Up.add(btn2); Up.add(btn3); Up.add(btn4); // 패널에 버튼 추가
		
		JPanel Center = new JPanel(); // 중단 패널 텍스트 필드를 지정해줄 패널을 만들고 텍스트의 위치를 북쪽으로 설정한다.
		Center.setLayout(new BorderLayout());
		JTextField text = new JTextField();
		Center.add(text,"North");
				
		JPanel sub = new JPanel(); // 중단 패널안에 들어갈 4행 3열을 갖는 그리드 레이아웃을 설정하여 각 12개의 버튼을 구성한다. 
		sub.setLayout(new GridLayout(4,3));

		for(int i = 1; i<=9; i++) {
			 sub.add(new JButton(i+""));
		} // 코드를 간결하게 하기 위해 반복문을 사용했다.

		btn5 = new JButton("*"); // 나머지 버튼을 삽입한다.
		btn6 = new JButton("0");
		btn7 = new JButton("#");
		sub.add(btn5); sub.add(btn6); sub.add(btn7); // 패널에 버튼 추가
		
		Center.add(sub,BorderLayout.CENTER); // 중단 패널에 텍스트 필드를 인자로 하여 추가한다.

		JPanel Down = new JPanel(); // 하단 패널을 생성하고 상단 패널과 같은 구성으로 버튼을 삽입한다.
		Down.setLayout(new GridLayout(1,2));
		btn5 = new JButton("전화걸기");
		btn6 = new JButton("이전");
		btn7 = new JButton("지우기");
		Down.add(btn5); Down.add(btn6); Down.add(btn7); // 패널에 버튼 추가
		
		// 프레임에 각 패널들을 상단,중단,하단에 추가한다.
		add(Up,BorderLayout.NORTH);
		add(Center,BorderLayout.CENTER);
		add(Down,BorderLayout.SOUTH); 
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		num6 win = new num6("다이얼 패드"); // 객체를 생성하여 출력한다.
	}

}
