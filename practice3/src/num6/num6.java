package num6;

import java.util.*;

public class num6 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = Input.nextInt();
		int temp = 0;
		
		int m = num/10000; //만의 자리 수
		temp = num%10000;
		int k = temp/1000; //천의 자리 수
		temp = temp%1000;
		int back = temp/100; //백의 자리 수
		temp = temp%100;
		int sip = temp/10; //십의 자리 수
		temp = temp%10;
		int one = temp/1; //일의 자리 수
		
		System.out.printf("%d만 %d천 %d백 %d십 %d입니다.",m,k,back,sip,one);
	}

}
