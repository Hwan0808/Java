package num10;

public class Computer {
	
	public String osType[] = {"����7","���� OS X","�ȵ���̵�"};
	public int name;
	public int memory;
	
	public Computer(int name, int memory ) {
		this.name = name;
		this.memory = memory;
	}
	
	public void print() {
		System.out.println("�ü��: " + osType[this.name] + ", " + "���θ޸�: " + this.memory);
	}
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i<=100; i++) {
			
			if (i%2==0||i%3==0||i%5==0||i%7==0) {
				continue;
			}
			else
				System.out.print(i + " ");
				count++;
			
				if(count%10==0) {
				System.out.println();
			}
		}
	}

}
