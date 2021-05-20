package num6;

public class PrimeNumber03 implements Runnable {

	private int num;
	
	public PrimeNumber03(int num) {
		this.num = num;
	}
	
	public void run() {
		int count = 0;
				
		System.out.println(Thread.currentThread().getName() + ": ");
		
		for(int i=2; i<=num; i++) {
			for(int j=2; j<=i; j++) {
                 if(i%j==0) 
                 {
                      count++;
                 }   
            }
   
            	if(count==1)
                 {
                 System.out.print(i+" ");
                 }
                 count=0;
        }
	}
}
