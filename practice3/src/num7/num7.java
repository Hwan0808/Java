package num7;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		
		int month = Input.nextInt();
		
		if(month>=1 && month<=6) {
			System.out.println("��ݱ��Դϴ�.");
		}
		else if (month>6 && month<=12)
			System.out.println("�Ϲݱ��Դϴ�.");
		else 
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
	}

}
