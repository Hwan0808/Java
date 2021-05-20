public class PrintChar extends Thread {

	public PrintChar (String name) {
		super(name);
	}
	
	public void run() {
		System.out.print(getName() + ": ");
		for(char ch = 'g'; ch <= 'm'; ch++) {
			System.out.printf("%c",ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PrintChar pc = new PrintChar("test 01");
		pc.start();
	}

}
