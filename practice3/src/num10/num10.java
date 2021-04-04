package num10;

import java.util.*;

public class num10 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("금액을 입력해주세요(최소 천 단위): ");
		int won = Input.nextInt();
		int temp = 0;
		
		int won_50000 = won/50000; //5만원 권
		temp = won%50000; //나눈 나머지를 저장
		int won_10000 = temp/10000;
		temp = temp%10000;
		int won_5000 = temp/5000;
		temp = temp%5000;
		int won_1000 = temp/1000;
		
		System.out.printf("50000권 %d개, 10000권 %d개, 5000원권 %d개, 1000권 %d개",won_50000,won_10000,won_5000,won_1000);
		
	}

}
