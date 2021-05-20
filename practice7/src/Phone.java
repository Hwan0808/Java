public class Phone {
	
	private String name; // 기본적으로 보안을 위해 private 로 선언한다.
	private String number; // 사용자의 이름과 전화번호 변수
	
	public Phone(String name, String number) { // 이름과 전화번호를 받아 기본생성자를 생성한다.
		this.name = name;
		this.number = number;
	}
	
	public String getName() { // 사용자의 이름을 반환하는 getName() 메소드
		return name;
	}

	public String getNumber() { // 사용자의 전화번호를 반환하는 getNumber() 메소드
		return number;
	}

	public String print() { // 사용자의 이름과 전화번호를 출력하는 print() 메소드
		return "이름: " + name + " 전화번호: " + number;
	}
}
