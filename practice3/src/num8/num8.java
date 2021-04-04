package num8;

import java.util.*;

public class num8 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("3가지 숫자를 입력해주세요: ");
		int a = Input.nextInt();
		int b = Input.nextInt();
		int c = Input.nextInt();

		int max; 
	
		if(a>b&&a>c) {
			max = a;
			System.out.println(max);
		}
		if(b>a&&b>c) {
			max = b;
			System.out.println(max);
		}
		if(c>a&&c>b) {
			max = c;
			System.out.println(max);
		}
		
	}

}
