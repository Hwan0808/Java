package num5;

import java.util.*;

public class num5 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("�⵵�� �Է����ּ���: ");
		
		int year = Input.nextInt();
		
		if(year%4==0 && year%400==0) {
				System.out.println("�����Դϴ�.");
		}
		else {
				System.out.println("����Դϴ�.");
		}
		if(year%4==0 && year%100==0) {
				System.out.println("����Դϴ�.");
		}
	}	
}


