package num9;

public class Rectangle {
	public double width;
	public double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getCircumference() {
		return (width * 2) + (height * 2);
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
	}
}
