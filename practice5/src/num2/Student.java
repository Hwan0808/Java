package num2;

public class Student {
	private String department;
	private int classof;
	
	public void Set_department(String department) {
		this.department = department;
	}
	
	public void Set_classof(int classof) {
		this.classof = classof;
	}
	
	public String Get_department() {
		return this.department;
	}
	
	public int Get_classof() {
		return this.classof;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Set_classof(201733035);
		s1.Set_department("정보통신공학과");
		System.out.println(s1.Get_classof());
		System.out.println(s1.Get_department());
	}

}
