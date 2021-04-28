package num3;

public class Cylinder {
	
	Circle c;
	double hight; // ≥Ù¿Ã
	
	Cylinder(Circle c ,double hight){
		this.c = c;
		this.hight=hight;
	}
	public double getVolume() {
		return c.getArea()*hight;
	}
	
	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cd.getVolume());
	}

}
