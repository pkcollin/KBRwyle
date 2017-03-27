
public class Triangle implements Shape {
	double base;
	double sideA;
	double sideB;



	public Triangle(double side1, double side2, double side3){
		base  = side1;
		sideA = side2;
		sideB = side3;
		//invalid triangles can be used - if one side is larger than the net of 2 other sides
	}
	
	//Heron's formula - area only knowing the length of the 3 sides
	public double getArea() {
		return Math.sqrt(this.getS()*(this.getS()-base)*(this.getS()-sideA)*(this.getS()-sideB));
	}

	public double getPerimeter() {
		return base+sideA+sideB;
	}
	
	//A mathematical figure called "semiperimeter" used to 
	//calculate area of a triangle given only side lengths
	public double getS(){
		return (base+sideA+sideB)/2;
	}

}
