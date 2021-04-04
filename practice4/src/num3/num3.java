package num3;

import java.util.*;

public class num3 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int a = Input.nextInt();
		
		do {
			System.out.print(a%10);
			a = a/10;
		} while(a!=0);

	}

}
