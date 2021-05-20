package num5;

public class PrimeNumber02 extends Thread {

	private int num;
	
	public PrimeNumber02(int num, String name) {
		this.num = num;
		setName(name);
	}
	
	public void run() {
		int count = 0;
				
		System.out.println(getName() + ": ");
		
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

