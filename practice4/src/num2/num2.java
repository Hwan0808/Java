package num2;

public class num2 {

	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			for(int j=0;j<7-i;j++) { //654321������ ����
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) { // �� �࿡ ���缭 n n-1 n-2
				System.out.print(j);
			}
			for(int j=0;j<=i;j++) { // �� �࿡ ���缭 0 1 2 ... n
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
