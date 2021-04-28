package shapes;

public class Circle implements Shape {
	private double r, a;
	
	public Circle(double r) {
		this.r = r;
		a = 3.14*r*r;
	}
	
	public void area() {	
		System.out.println("The area of Circle: "+a);
		
	}

	
}
