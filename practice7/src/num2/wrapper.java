package num2;

public class wrapper {

	static void printf(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
		Byte a = 1;
		Short b = 2;
		Integer c = 3;
		Long d = (long) 4;
		Float e = (float) 5.2;
		Double f = 6.4;
		Character g = 'g';
		Boolean h = true;
		
		byte A = a;
		short B = b;
		int C = c;
		long D = d;
		float E = e;
		double F = f;
		char G = g;
		boolean H = h;
		
		wrapper.printf(a);
		wrapper.printf(b);
		wrapper.printf(c);
		wrapper.printf(d);
		wrapper.printf(e);
		wrapper.printf(f);
		wrapper.printf(g);
		wrapper.printf(h);

	}

}
