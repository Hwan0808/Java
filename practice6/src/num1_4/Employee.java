package num1_4;

public class Employee {
	
	public String name;
	public String address;
	public int age;
	public String department;
	public int salary;
	
	public Employee(String name, int age, String address, String department) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println(this.name + " " + this.age + " " + this.address + " " + this.department);
	}
	
	public void Set_Salary(int salary) {

	}
	
	public void Set_WorkHours(int time) {

	}
	
	public static void main(String[] args) {
		Employee r = new Regular("�̼���", 35, "����", "�λ��");
		Employee t = new Temporary("�庸��", 25, "��õ", "�渮��");
		r.Set_Salary(5_000_000);
		r.printInfo();
		t.Set_WorkHours(120);
		t.printInfo();
	}

}
