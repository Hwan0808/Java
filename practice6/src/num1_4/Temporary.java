package num1_4;

public class Temporary extends Employee{
	
	public int time;
	public int payment = 10000;
	
	public Temporary(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	public void Set_WorkHours(int time) {
		this.time = time;
		this.payment = time * payment;
	}
	
	public void printInfo() {
		System.out.println("�������� " + "���ѽð�: " + this.time + " �޿�: " + this.payment);
	}
	
	public static void main(String[] args) {
		Regular r = new Regular("�̼���", 35, "����", "�λ��");
		Temporary t = new Temporary("�庸��", 25, "��õ", "�渮��");
		r.Set_Salary(5_000_000);
		r.printfInfo();
		t.Set_WorkHours(120);
		t.printInfo();
		
		
	}
	
	

}
