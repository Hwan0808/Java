package num7;

import java.util.Date;

public class PrintTime implements Runnable {

	private int num;
	Date now;
	
	public PrintTime(int num) {
		this.num = num;
	}
	
	public void run() {
		
		try {
			for(int i=0;i<num;i++) {
				now = new Date();
				Thread.sleep(1000); // 딜레이를 주기 위해
				System.out.println("순위: " + Thread.currentThread().getPriority() + " " + now + " " + Thread.currentThread().getName());
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
