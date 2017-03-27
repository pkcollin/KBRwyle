
public class Rectangle implements Shape {
	//since it's a rectangle it only needs the base and height
	double base;
	double height;



	public Rectangle(double side1, double side2){
		base  = side1;
		height = side2;
	}
	
	//Heron's formula
	public double getArea() {
		return base*height;
	}

	public double getPerimeter() {
		return (base*2) + (height*2);
	}
	

}

