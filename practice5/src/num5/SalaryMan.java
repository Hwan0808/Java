package num5;

public class SalaryMan {
	
	public int salary = 1000000;
	
	public int getAnnualGross() {		
		return this.salary* 12  * 5;
	}
	
	public SalaryMan() {
		
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}

}
