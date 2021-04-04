package num4;

import java.util.*;

public class num4 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		char a = Input.next().charAt(0);
		double b = Input.nextDouble();
		
		if(a=='f'||a=='F') {
		b = (5.0/9.0)*(b-32);
		System.out.printf("섭씨 온도는: %.2f",b);
		}
		else if(a=='c'||a=='C') {
		b = (9.0/5.0)*b+32;
		System.out.printf("화씨 온도는: %.2f",b);	
		}
		else
		System.out.println("잘못된 문자입력!");
	}

}
