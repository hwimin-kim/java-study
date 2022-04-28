package paint;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Point point1 = new Point(); point1.setX(20); point1.setY(20); point1.show();
		 */
		
		Point point1 = new Point();
		drawPoint(point1);
		
		Point point2 = new Point(50,100);
		drawPoint(point2);
		//point2.disapear();
		point2.show(false);
	
		Point point3 = new ColorPoint(40, 50, "red");
		//drawPoint(point3);
		point3.show(true);
		point3.show(false);
		
		//삼각형
		Triangle triangle = new Triangle();
		drawTriangle(triangle);
		
		//사각형
		Rectangle rectangle = new Rectangle();
		drawRectangle(rectangle);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
	/*
	 * public static void drawColorPoint(ColorPoint point) { point.show(); }
	 */
	
	public static void drawTriangle(Triangle triangle) {
		triangle.draw();
	}
	
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}
}
