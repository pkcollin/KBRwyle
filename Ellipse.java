
public class Ellipse {
	double a;
	double b;

	public Ellipse(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double getArea(){
		return Math.PI*a*b;
	}
	
	//approximate
	public double getPerimeter(){
		return Math.PI*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b)));
	}
}
