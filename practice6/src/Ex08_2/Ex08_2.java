package Ex08_2;

class A {}
class AB extends A {}
class ABC extends AB {}

public class Ex08_2 {

	public static void main(String[] args) {
		
		A x = new A();
		A y = new AB();
		A z = new ABC();
		
		System.out.println(x instanceof A);
		System.out.println(x instanceof AB);
		System.out.println(y instanceof AB);
		System.out.println(y instanceof ABC);
		System.out.println(z instanceof ABC);
		System.out.println(z instanceof AB);
		System.out.println(z instanceof A);
		
		System.out.println(y instanceof A);

	}

}
