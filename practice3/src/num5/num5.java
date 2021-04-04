package num5;

import java.util.*;

public class num5 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("년도를 입력해주세요: ");
		
		int year = Input.nextInt();
		
		if(year%4==0 && year%400==0) {
				System.out.println("윤년입니다.");
		}
		else {
				System.out.println("평년입니다.");
		}
		if(year%4==0 && year%100==0) {
				System.out.println("평년입니다.");
		}
	}	
}


