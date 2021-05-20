import java.util.*;

public class ex5 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Object obj[] = new Integer[2];
		
		try {
			obj[1] = new Integer(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			obj = new Object[-3];
		} catch (NegativeArraySizeException ex) {
			System.out.println(ex);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		double data[] = {3.1,2.4,4.6};
		
		try {
			System.out.println(data[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� 1 " + e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�" + e);
		} catch (Exception e) {
			System.out.println("���ܹ߻�" + e);
		}
		
		System.out.println(Class.forName("java.lang.obj"));
		
		
		
	}

}
