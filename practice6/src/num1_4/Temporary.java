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
		System.out.println("비정규직 " + "일한시간: " + this.time + " 급여: " + this.payment);
	}
	
	public static void main(String[] args) {
		Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.Set_Salary(5_000_000);
		r.printfInfo();
		t.Set_WorkHours(120);
		t.printInfo();
		
		
	}
	
	

}
