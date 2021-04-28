package Ex09_3;

public class A {
	
	private int m = 10;
	
}

public class B extends A {
	private int n = 20;
	
	public int add() {
		return super.m + n;
	}
}

