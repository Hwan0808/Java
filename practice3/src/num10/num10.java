package num10;

import java.util.*;

public class num10 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("�ݾ��� �Է����ּ���(�ּ� õ ����): ");
		int won = Input.nextInt();
		int temp = 0;
		
		int won_50000 = won/50000; //5���� ��
		temp = won%50000; //���� �������� ����
		int won_10000 = temp/10000;
		temp = temp%10000;
		int won_5000 = temp/5000;
		temp = temp%5000;
		int won_1000 = temp/1000;
		
		System.out.printf("50000�� %d��, 10000�� %d��, 5000���� %d��, 1000�� %d��",won_50000,won_10000,won_5000,won_1000);
		
	}

}
