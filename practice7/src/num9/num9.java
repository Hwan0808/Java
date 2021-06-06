package num9;

import java.util.*;

public class num9 {

	public static void main(String[] args) {

		HashMap<String,String> m = new HashMap<String,String>();
		m.put("김미현", "010-3675-8754");
		m.put("박나현", "010-2834-9384");
		m.put("강다현", "010-1294-2349");
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("검색할 이름을 적으세요. >>");
		name=s.nextLine();
		System.out.println("입력하신 "+name+"의 전화번호는 "+m.get(name)+" 입니다.");
		
	}

}
