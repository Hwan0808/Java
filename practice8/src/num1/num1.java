package num1;

import java.util.*;

public class num1 {

	public static void main(String[] args) {
		
		try {
			while (true) {
				int x = 0, y = 0, z = 0;
				Scanner Input = new Scanner(System.in);
				System.out.print("���� �ΰ� �Է�: ");
				x = Input.nextInt();
				y = Input.nextInt();
				z = x * y;
				System.out.printf("%d * %d = %d %n",x,y,z);
			}
		} catch (InputMismatchException e) {
			System.err.println("���ܰ� �߻��߽��ϴ�. �ٽ� �Է����ּ���");
			return;
		}
	}

}
