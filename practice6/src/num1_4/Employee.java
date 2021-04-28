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
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		r.Set_Salary(5_000_000);
		r.printInfo();
		t.Set_WorkHours(120);
		t.printInfo();
	}

}
