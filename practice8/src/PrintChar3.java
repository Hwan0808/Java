

class MyPrint implements Runnable {
	
	public void run() {
		System.out.print(Thread.currentThread().getName() + ": ");
		for (char ch = 'g'; ch <= 'm'; ch++) {
			System.out.printf("%c",ch);
		}
		System.out.println();
	}
	
}

public class PrintChar3 {

	public static void main(String[] args) {
		Thread th1 = new Thread(new MyPrint(), "스레드 1");
		Thread th2 = new Thread(new MyPrint(), "스레드 2");
		th1.start();
		th2.start();
	}

}
