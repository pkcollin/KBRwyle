
public class Square {
	double side;
	
	public Square(double side){
		this.side = side;
	}
	
	public double getArea(){
		return side*side;
	}
	
	public double getPerimeter(){
		return side*4;
	}

}
