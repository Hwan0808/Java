package num9;

import java.util.*;

public class num9 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Ű�� �����Ը� �Է����ּ���: ");
		double height = Input.nextDouble();
		double weight = Input.nextDouble();
		
		if(weight<=(height-100)*0.9) {
			System.out.println("����");
		}
		else
			System.out.println("��");
		
	}

}
