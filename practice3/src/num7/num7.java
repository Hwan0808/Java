package num7;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("달을 입력해주세요: ");
		
		int month = Input.nextInt();
		
		if(month>=1 && month<=6) {
			System.out.println("상반기입니다.");
		}
		else if (month>6 && month<=12)
			System.out.println("하반기입니다.");
		else 
			System.out.println("잘못입력하셨습니다.");
	}

}
