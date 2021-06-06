package num10;

import java.util.*;

class MyData<K, V1, V2>{
	
	private HashMap<K,V1> m1; // �̸�, (����ȣ,��Ż�)
	private HashMap<K,V2> m2; // ����ȣ, ��Ż�
	public MyData() {
		m1=new HashMap<K,V1>();
		m2=new HashMap<K,V2>();
	}
	public void add(K n, V1 p, V2 a) { // �̸�, ����ȣ, ��Ż�
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
		my.add("���̿�", "010-3196-3985", "KT");
		my.add("���ƿ�", "010-1342-1453", "SK");
		my.add("������", "010-1236-4573", "LG");
		
		Scanner s = new Scanner(System.in);
		System.out.println("�˻��� �̸��� ��������. >>");
		String name = s.nextLine();
		System.out.println("�Է��Ͻ� "+name+"�� ��ȭ��ȣ�� "+my.getV1(name)+", �̵���Ż�� "+my.getV2(name)+"�Դϴ�.");
		
	}

}
