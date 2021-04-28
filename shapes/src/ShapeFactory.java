package shapes;

public class ShapeFactory {
	
	   public Shape getShape(String shapeType,double r){
		      if(shapeType == null){
		         return null;
		      }		
		      if(shapeType.equalsIgnoreCase("CIRCLE")){
		         return new Circle(r);  
		      } 
		      
		      return null;
		   }
		   
		  public Shape getShape(String shapeType,double a,double b){
			      if(shapeType == null){
			         return null;
			      }		
			      if(shapeType.equalsIgnoreCase("RECTANGLE")){
			         return new Rectangle(a,b);
			         
			      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
				         return new Triangle(a,b);
			      }
			      return null;
			   }
	}
