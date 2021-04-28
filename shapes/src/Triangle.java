package shapes;

public class Triangle implements Shape {
	private double b,h,a;

	public Triangle(double b,double h) {
		this.b = b;
		this.h = h;
		a = b * h* 0.5;
	}
	
	public void area() {
		
		System.out.println("The area of triangle is: "+a);
		
	}
	


	
}
