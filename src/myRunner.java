
public class myRunner {
	public static void main(String[] args) { 
		Circle c = new Circle(100); 
		System.out.println("Area of Circle " + c.getArea()); 
		
		//Example of Object type casting 
		// declrattion of object variable obj of the Shape class 
		
		// Shape sObj ; // object creation of the Shape class 
		Shape sObj = new Shape(); 
		sObj.displayshapeName(); 
		System.out.println(sObj instanceof Shape); // true 
		
		// object creation of the Circle class 
		System.out.println("+++++++++"); 
		
		// it's fine because a Circle is a Shape by inheritance 
		Shape shapeCircleObj = new Circle(100); // UpCasting 
		shapeCircleObj.displayshapeName(); 
		System.out.println("Are of Circle " + shapeCircleObj.getArea()); 
		System.out.println(shapeCircleObj); // Run circle's toString()
		
		// Use instanceof operator for Validation 
		System.out.println(shapeCircleObj instanceof Circle); // true 
		System.out.println(sObj instanceof Circle); // false because Shape is not a Circle 
		
		System.out.println("---------------------"); 
		Shape shapeRectangleObj = new Rectangle("Red");  // UpCasting 
		shapeRectangleObj.displayshapeName(); 
		shapeRectangleObj.setHeight(2);
		shapeRectangleObj.setWidth(2);
		System.out.println("Area of Rectanlge is " + shapeRectangleObj.getArea());
		System.out.println(shapeRectangleObj); // Run Rectangle's toString()
		//Use instanceof operator for Validation 
		System.out.println(shapeRectangleObj instanceof Rectangle); // true 
		System.out.println(sObj instanceof Rectangle); // false because Shape is not a Rectangle
		
		System.out.println("---------------------"); 
		
		Cylinder cylinderShape = new Cylinder(3); // UpCasting 
		cylinderShape.displayshapeName(); 
		cylinderShape.setHeight(3);
		System.out.println("Area of Cylinder is " + cylinderShape.getVolume()); 
		System.out.println(cylinderShape); // Run cylinderShape's toString()
		
	}

}
