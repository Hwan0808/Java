package num10;

import java.util.*;

class MyData<K, V1, V2>{
	
	private HashMap<K,V1> m1; // 이름, (폰번호,통신사)
	private HashMap<K,V2> m2; // 폰번호, 통신사
	public MyData() {
		m1=new HashMap<K,V1>();
		m2=new HashMap<K,V2>();
	}
	public void add(K n, V1 p, V2 a) { // 이름, 폰번호, 통신사
		m1.put(n, p);
		m2.put(n, a);
	}
	public V1 getV1(K n){
		return m1.get(n);
	}
	public V2 getV2(K n) {
		return m2.get(n);
	}
}

public class num10 {

	public static void main(String[] args) {
		
		MyData<String, String, String> my = new MyData<String, String, String>();
		my.add("김이용", "010-3196-3985", "KT");
		my.add("정아영", "010-1342-1453", "SK");
		my.add("강은영", "010-1236-4573", "LG");
		
		Scanner s = new Scanner(System.in);
		System.out.println("검색할 이름을 적으세요. >>");
		String name = s.nextLine();
		System.out.println("입력하신 "+name+"의 전화번호는 "+my.getV1(name)+", 이동통신사는 "+my.getV2(name)+"입니다.");
		
	}

}
