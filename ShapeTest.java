
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ShapeTest {
	
	
	@Test
	public void evaluateArea() {
		Circle cir = new Circle(2);
		Ellipse ell = new Ellipse(2.0, 3.0);
		Quadrilateral quad = new Quadrilateral(1.41421356237, 1.41421356237, 90, 1, 1, 1, 1);
		Rectangle rect = new Rectangle(2, 4);
		Square squ = new Square(3.0);
		Triangle tri = new Triangle(2, 2, 2.82);

		
		
		double ans = cir.getArea();
		assertEquals(12.57, ans, .2);
		
		ans = ell.getArea();
		assertEquals(18.85, ans, .2);
		
		ans = quad.getArea();
		assertEquals(1, ans, .2);
		
		ans = rect.getArea();
		assertEquals(8, ans, .2);
		
		ans = squ.getArea();
		assertEquals(9, ans, .2);
		
		ans = tri.getArea();
		assertEquals(2, ans, .2);
	  }
	
	@Test
	public void evaluatePerimeter() {
		Circle cir = new Circle(2);
		Ellipse ell = new Ellipse(2.0, 3.0);
		Quadrilateral quad = new Quadrilateral(1.41421356237, 1.41421356237, 90, 1, 1, 1, 1);
		Rectangle rect = new Rectangle(2, 4);
		Square squ = new Square(3.0);
		Triangle tri = new Triangle(2, 2, 2.82);
		
		double ans = cir.getPerimeter();
		assertEquals(12.57, ans, .2);
		
		ans = ell.getPerimeter();
		assertEquals(15.87, ans, .2);
		
		ans = quad.getPerimeter();
		assertEquals(4, ans, .2);
		
		ans = rect.getPerimeter();
		assertEquals(12, ans, .2);
		
		ans = squ.getPerimeter();
		assertEquals(12, ans, .2);
		
		ans = tri.getPerimeter();
		assertEquals(6.82, ans, .2);
	}
	
	

}
