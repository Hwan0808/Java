package num10;

public class Computer {
	
	public String osType[] = {"윈도7","애플 OS X","안드로이드"};
	public int name;
	public int memory;
	
	public Computer(int name, int memory ) {
		this.name = name;
		this.memory = memory;
	}
	
	public void print() {
		System.out.println("운영체제: " + osType[this.name] + ", " + "메인메모리: " + this.memory);
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
