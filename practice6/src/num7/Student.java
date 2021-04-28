package num7;

import java.util.*;

public class Student extends Person {
	public String school; // �б�
	public String department; // �а�
	public int classNum; // �й�
	public double score[]; // ���� �迭
	
	public Student(String name, int age, String address, String school, String department, int classNum) {
		super(name, age, address);
		this.school = school;
		this.department = department;
		this.classNum = classNum;
		score = new double[8];
	}
	
	public void printInfo() {
		System.out.println("�̸�: " + this.name);
		System.out.println("�ּ�: " + this.address);
		System.out.println("�б�: " + this.school);
		System.out.println("�а�: " + this.department);
		System.out.println("�й�: " + this.classNum);
		System.out.println("--------------------------------");
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("8�б� ������ ������� �Է��ϼ���.");
	
		
		for(int i = 0; i<score.length; i++) {
			System.out.print(i + 1 "�б� ���� > ");
			score[i] = Input.nextDouble();
		}
		System.out.println("--------------------------------");
		System.out.println("8�б� �� ��� ������ " + average() +"�Դϴ�.");
	}
	
	public double average() {
		
		double sum = 0;
	
		for(double i : score) {
			sum += i;
		}
		return sum / score.length; 
	}
	
	public static void main(String[] args) {
		Student kim = new Student("�����", 20, "����� ���Ǳ�", "���缭����б�", "���������а�", 20132222);
		kim.printInfo();
		
		
	}

}
