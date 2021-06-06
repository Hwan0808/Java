package num7;

import java.util.*;

public class num7 {

	private static final long serialVersionUIO = 1L;
	
	public static void main(String[] args) {
	
	String tmp;
	HashSet<String> hs1 = new HashSet<String>();
	HashSet<String> hs2 = new HashSet<String>();

	Scanner Input = new Scanner(System.in);
	
	System.out.println("표준입력으로 문자열을 여러 줄에 입력하세요.");
	System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.");
	
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
	
	System.out.println("중복되지 않은 문자열 =>"+ hs1+"\n");
	System.out.println("중복된 문자열 =>"+ hs2);

  }
}