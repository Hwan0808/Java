package num9;

import java.util.*;

public class num9 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("키와 몸무게를 입력해주세요: ");
		double height = Input.nextDouble();
		double weight = Input.nextDouble();
		
		if(weight<=(height-100)*0.9) {
			System.out.println("정상");
		}
		else
			System.out.println("비만");
		
	}

}
