package num7;

import java.util.*;

public class Student extends Person {
	public String school; // 학교
	public String department; // 학과
	public int classNum; // 학번
	public double score[]; // 점수 배열
	
	public Student(String name, int age, String address, String school, String department, int classNum) {
		super(name, age, address);
		this.school = school;
		this.department = department;
		this.classNum = classNum;
		score = new double[8];
	}
	
	public void printInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("주소: " + this.address);
		System.out.println("학교: " + this.school);
		System.out.println("학과: " + this.department);
		System.out.println("학번: " + this.classNum);
		System.out.println("--------------------------------");
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("8학기 학점을 순서대로 입력하세요.");
	
		
		for(int i = 0; i<score.length; i++) {
			System.out.print(i + 1 "학기 학점 > ");
			score[i] = Input.nextDouble();
		}
		System.out.println("--------------------------------");
		System.out.println("8학기 총 평균 평점은 " + average() +"입니다.");
	}
	
	public double average() {
		
		double sum = 0;
	
		for(double i : score) {
			sum += i;
		}
		return sum / score.length; 
	}
	
	public static void main(String[] args) {
		Student kim = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", 20132222);
		kim.printInfo();
		
		
	}

}
