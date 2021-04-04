package num1;

public class num1 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==0||i%3==0||i%5==0||i%7==0) {
				continue;
			}
			System.out.print(i+" ");
			count++;
			
			if(count%10==0) {
				System.out.println();
			}
		}
	}
}
