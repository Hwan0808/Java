import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class PhoneNumber {

	HashMap<String,Phone> hm = new HashMap<String,Phone>(); // HashMap�� �̿��ؼ� ���ڿ��� 'Phone' Ŭ������ ��ü�� ����ϴ� ������ �ۼ��Ѵ�.
	Scanner Input = new Scanner(System.in); // �Է� �Լ� 
	private String name; // ������� �̸��� �Է¹��� ���� 
	private String number; // ������� ��ȭ��ȣ�� �Է¹��� ���� 
	
	public void run() {
		while(true) {
			
			System.out.println("[��ȭ��ȣ��]");
			System.out.println("�Է�: 1, �˻�: 2, ����: 3, ����: 4, ��ü����: 5, �ý�������: 6");
			System.out.print("���ڸ� �Է��ϼ��� : ");
			
			int menu = Input.nextInt(); // ��ȣ�� �Է� �޾� �� ��Ȳ�� �´� �Լ��� ����Ѵ�.
			
			switch(menu) {
				
			case 1: insert(); // �Է� - �̸��� ��ȭ��ȣ�� �Է��Ѵ�.
			break;
			
			case 2: search(); // �˻� - �̸��� �˻��ϸ� ��ȭ��ȣ�� ����Ѵ�.
			break;
			
			case 3: update(); // ���� - �̸��� ��ȭ��ȣ�� �����Ѵ�.
			break;
			
			case 4: delete(); // ���� - �̸��� �Է��ϸ� ��ȭ��ȣ�� �����Ѵ�.
			break;
			
			case 5: all(); // ����Ǿ� �ִ� ��� �̸��� ��ȭ��ȣ�� ����Ѵ�.
			break;
			
			case 6: System.out.println("���α׷��� �����մϴ�..."); // ���� - �ý����� �����Ѵ�.
			return;
			
			}
		}
	}
	
	public void insert() { // ������� �̸��� ��ȭ��ȣ�� �Է¹޾� HashMap�� ������ش�. 
		System.out.print("�̸�: "); 
		name = Input.next(); 
		System.out.print("��ȭ��ȣ: ");
		number = Input.next();
		hm.put(name, new Phone (name, number));
	}
	
	public void search() { // ������� �̐a�� �Է¹޾� p ��ü�� �̸�(key)�� �Ѱ����� p ��ü�� ������ �ִ� print() �޼ҵ带 ȣ���Ѵ�.
		System.out.print("�̸�: ");
		name = Input.next();
		Phone p = hm.get(name);
		System.out.println(p.print());
	}
	
	public void update() { // ������� �̸��� ��ȭ��ȣ�� �Է¹޾� p ��ü�� �̸��� ��ȭ��ȣ�� ���� �����ѵ� HashMap�� �̸��� ��ä�� ���� �Ѱ��ش�.
		System.out.print("�̸�: ");
		name = Input.next();
		System.out.print("��ȭ��ȣ: ");
		number = Input.next();
		Phone p = new Phone (name, number);
		hm.put(name, p);
		System.out.println(p.print());
	}
	
	public void delete() { // ������� �̸��� �Է¹޾� HashMap���� �̸���(Key)�� �Ѱ��ָ� ������� ��ȭ��ȣ(Value)�� ��������.
		System.out.print("�̸�: ");
		name = Input.next();
		hm.remove(name);
	}
	
	public void all() {
		Iterator<String> keys = hm.keySet().iterator(); 
		// ���ڿ��� �Է¹��� �� �ִ� HashMap�� iterator�� �����Ѵ�. iterator�� ����� �� �ٷ� �� ������ ��������.
		
		while(keys.hasNext()) {	// ���� ��ü�� ���� �� ���� �ݺ��ϸ鼭 HashMap�� ��ϵǾ� �ִ� ������� �̸��� ��ȭ��ȣ�� ��� ����Ѵ�.
			String name = keys.next(); 
			Phone p = hm.get(name);
			System.out.println("�̸�: "+ p.getName() + " ��ȭ��ȣ: " + p.getNumber());
		}
	}
	
	public static void main(String[] args) {
		PhoneNumber pb = new PhoneNumber(); // run() �޼ҵ带 ȣ���ϱ� ���� PhoneNumber Ŭ������ pb ��ü�� �����Ѵ�. 
		pb.run(); // �ݺ� �Լ� run()�� �����Ѵ�.
		
	}

}
