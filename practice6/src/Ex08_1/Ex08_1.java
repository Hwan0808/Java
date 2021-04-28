package Ex08_1;

public class Ex08_1 {

	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println(sup.getN());
		System.out.println(sup.n);
		System.out.println( ((Sub) sup).n );
		System.out.println( ((Sub) sup).getSuperN() );
	}

}
