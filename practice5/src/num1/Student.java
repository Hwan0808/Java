package num1;

public class Student {

	public String department;
	public int classof;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.department = "정보통신공학과";
		s1.classof = 201733035;
		System.out.println(s1.classof + " " + s1.department);
	}

}
