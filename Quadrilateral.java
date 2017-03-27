
public class Quadrilateral implements Shape {
	//since it's a rectangle it only needs the base and height
	double side1, side2, side3, side4;
	double p;
	double q;
	double angle;



	public Quadrilateral(double diagonal1, double diagonal2, double a, double side1, double side2, double side3, double side4){
		p = diagonal1;
		q = diagonal2;
		angle = a;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}
	
	
	public double getArea() {
		return (0.5)*p*q*Math.sin(angle);
	}

	public double getPerimeter() {
		return side1 + side2 + side3 + side4;
	}
	

}
