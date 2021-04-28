package shapes;

public class FactoryPattern {

	   public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("RECTANGLE",2,10);

	      //call draw method of Circle
	      shape1.area();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("Circle",2);

	      //call draw method of Rectangle
	      shape2.area();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("TRIANGLE",4,2);

	      //call draw method of square
	      shape3.area();
	   }
	}