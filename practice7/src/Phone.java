public class Phone {
	
	private String name; // �⺻������ ������ ���� private �� �����Ѵ�.
	private String number; // ������� �̸��� ��ȭ��ȣ ����
	
	public Phone(String name, String number) { // �̸��� ��ȭ��ȣ�� �޾� �⺻�����ڸ� �����Ѵ�.
		this.name = name;
		this.number = number;
	}
	
	public String getName() { // ������� �̸��� ��ȯ�ϴ� getName() �޼ҵ�
		return name;
	}

	public String getNumber() { // ������� ��ȭ��ȣ�� ��ȯ�ϴ� getNumber() �޼ҵ�
		return number;
	}

	public String print() { // ������� �̸��� ��ȭ��ȣ�� ����ϴ� print() �޼ҵ�
		return "�̸�: " + name + " ��ȭ��ȣ: " + number;
	}
}
