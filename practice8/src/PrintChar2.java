
public class PrintChar2 extends Thread {

	public PrintChar2 (String name) {
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
		PrintChar2 pc1 = new PrintChar2("test 01");
		PrintChar2 pc2 = new PrintChar2("test 02");
		pc1.start();
		pc2.start();

	}

}
