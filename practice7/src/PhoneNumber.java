import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class PhoneNumber {

	HashMap<String,Phone> hm = new HashMap<String,Phone>(); // HashMap을 이용해서 문자열과 'Phone' 클래스의 객체를 허용하는 문장을 작성한다.
	Scanner Input = new Scanner(System.in); // 입력 함수 
	private String name; // 사용자의 이름을 입력받을 변수 
	private String number; // 사용자의 전화번호를 입력받을 변수 
	
	public void run() {
		while(true) {
			
			System.out.println("[전화번호부]");
			System.out.println("입력: 1, 검색: 2, 변경: 3, 삭제: 4, 전체보기: 5, 시스템종료: 6");
			System.out.print("숫자를 입력하세요 : ");
			
			int menu = Input.nextInt(); // 번호를 입력 받아 각 상황에 맞는 함수를 출력한다.
			
			switch(menu) {
				
			case 1: insert(); // 입력 - 이름과 전화번호를 입력한다.
			break;
			
			case 2: search(); // 검색 - 이름을 검색하면 전화번호를 출력한다.
			break;
			
			case 3: update(); // 변경 - 이름과 전화번호를 변경한다.
			break;
			
			case 4: delete(); // 삭제 - 이름을 입력하면 전화번호를 삭제한다.
			break;
			
			case 5: all(); // 저장되어 있는 모든 이름과 전화번호를 출력한다.
			break;
			
			case 6: System.out.println("프로그램을 종료합니다..."); // 종료 - 시스템을 종료한다.
			return;
			
			}
		}
	}
	
	public void insert() { // 사용자의 이름과 전화번호를 입력받아 HashMap에 등록해준다. 
		System.out.print("이름: "); 
		name = Input.next(); 
		System.out.print("전화번호: ");
		number = Input.next();
		hm.put(name, new Phone (name, number));
	}
	
	public void search() { // 사용자의 이륾을 입력받아 p 객체에 이름(key)을 넘겨준후 p 객체가 가지고 있는 print() 메소드를 호출한다.
		System.out.print("이름: ");
		name = Input.next();
		Phone p = hm.get(name);
		System.out.println(p.print());
	}
	
	public void update() { // 사용자의 이름과 전화번호를 입력받아 p 객체에 이름과 전화번호를 새로 수정한뒤 HashMap에 이름과 객채의 값을 넘겨준다.
		System.out.print("이름: ");
		name = Input.next();
		System.out.print("전화번호: ");
		number = Input.next();
		Phone p = new Phone (name, number);
		hm.put(name, p);
		System.out.println(p.print());
	}
	
	public void delete() { // 사용자의 이름을 입력받아 HashMap에서 이름을(Key)를 넘겨주면 사용자의 전화번호(Value)가 지워진다.
		System.out.print("이름: ");
		name = Input.next();
		hm.remove(name);
	}
	
	public void all() {
		Iterator<String> keys = hm.keySet().iterator(); 
		// 문자열을 입력받을 수 있는 HashMap의 iterator를 설정한다. iterator는 사용한 뒤 바로 그 내용이 지워진다.
		
		while(keys.hasNext()) {	// 다음 객체가 있을 때 까지 반복하면서 HashMap에 등록되어 있는 사용자의 이름과 전화번호를 모두 출력한다.
			String name = keys.next(); 
			Phone p = hm.get(name);
			System.out.println("이름: "+ p.getName() + " 전화번호: " + p.getNumber());
		}
	}
	
	public static void main(String[] args) {
		PhoneNumber pb = new PhoneNumber(); // run() 메소드를 호출하기 위해 PhoneNumber 클래스의 pb 객체를 생성한다. 
		pb.run(); // 반복 함수 run()을 실행한다.
		
	}

}
