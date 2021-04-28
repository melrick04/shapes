package shapes;

public class Rectangle implements Shape {
	private double l, b, a;
	
	public Rectangle(double l,double b) {
		this.l = l;
		this.b = b;
		a = l*b;
	}

	
	public void area() {
		
		System.out.println("The area of Rectangle is: "+a);
		
	}
	


}
