package num7;

import java.util.*;

public class num7 {

	private static final long serialVersionUIO = 1L;
	
	public static void main(String[] args) {
	
	String tmp;
	HashSet<String> hs1 = new HashSet<String>();
	HashSet<String> hs2 = new HashSet<String>();

	Scanner Input = new Scanner(System.in);
	
	System.out.println("ǥ���Է����� ���ڿ��� ���� �ٿ� �Է��ϼ���.");
	System.out.println("����� ���÷��� �������� ǥ���Է����� quit�� �Է��ϼ���.");
	
	tmp = Input.next();
	
	while(true) {
		
		tmp = Input.next();
		
		if(tmp.equals("quit")) {
			break;
		} 
		
		else {
			
			if(hs1.contains(tmp)) {
				hs2.add(tmp);
				hs1.remove(tmp);
			} 
			
			else {
				hs1.add(tmp);
			}
		}
	}
	
	System.out.println("�ߺ����� ���� ���ڿ� =>"+ hs1+"\n");
	System.out.println("�ߺ��� ���ڿ� =>"+ hs2);

  }
}