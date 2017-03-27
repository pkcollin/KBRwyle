public class Circle {
	double r;

	public Circle(double radius){
		r = radius;
	}
	
	public double getArea(){
		return Math.PI*(Math.pow(r,2));
	}
	
	public double getPerimeter(){
		return Math.PI*2*r;
	}
}
