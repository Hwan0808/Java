package num1;

import java.util.*;

public class sum_average {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int A = Input.nextInt();
		int B = Input.nextInt();
		System.out.printf("합은: %d 평균은: %d ",A+B,(A+B)/2);
	}

}
