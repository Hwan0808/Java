package num4;

public class PrimeNumber01 extends Thread {
	
	private int num;
	
	public PrimeNumber01 (int num) {
		this.num = num;
	}
	
	public void run() {
		
		int count = 0;
		
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
