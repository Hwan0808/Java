package num1_4;

public class Regular extends Employee{

	public Regular(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	public void Set_Salary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("정규직 " + "월급: " + this.salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
