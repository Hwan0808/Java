package Ex08_3;

public class Computer {

	static int total;
	String kind;
	int memSize;
	
	public void decreaseMen(int a) {
		memSize -= a;
	}
	
	public int getMem() {
		return memSize;
	}
	
	public Computer(int memSize, String kind) {
		this.memSize = memSize;
		this.kind = kind;
		total++;
	}
	
	public static void main(String[] args) {
		Computer com1 = new Computer(64, "PC1");
		Computer com2 = new Computer(256, "PC2");
		com1.decreaseMen(32);
		System.out.println(com1.getMem());
		System.out.println(Computer.total);
		System.out.println(com2.total);

	}

}
