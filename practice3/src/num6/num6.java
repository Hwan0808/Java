package num6;

import java.util.*;

public class num6 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		int num = Input.nextInt();
		int temp = 0;
		
		int m = num/10000; //���� �ڸ� ��
		temp = num%10000;
		int k = temp/1000; //õ�� �ڸ� ��
		temp = temp%1000;
		int back = temp/100; //���� �ڸ� ��
		temp = temp%100;
		int sip = temp/10; //���� �ڸ� ��
		temp = temp%10;
		int one = temp/1; //���� �ڸ� ��
		
		System.out.printf("%d�� %dõ %d�� %d�� %d�Դϴ�.",m,k,back,sip,one);
	}

}
