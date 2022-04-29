package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.*;
import com.douzone.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Point point1 = new Point(); point1.setX(20); point1.setY(20); point1.show();
		 */
		
		Point point1 = new Point();
		draw(point1);
		
		Point point2 = new Point(50,100);
		draw(point2);
		//point2.disapear();
		point2.show(false);
	
		Point point3 = new ColorPoint(40, 50, "red");
		// drawPoint(point3);
		point3.show(true);
		point3.show(false);
		
		// 삼각형
		Triangle triangle = new Triangle();
		draw(triangle);
		
		// 사각형
		Rectangle rectangle = new Rectangle();
		draw(rectangle);
		
		// 원형
		Circle circle = new Circle();
		draw(circle);
		
		// 텍스트
		GraphicText graphicText = new GraphicText("Helloworld");
		draw(graphicText);
		
		// instanceof 연산자 테스트
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		
		// 오류: class는 Hierachy 상위와 하위만 instaceof 연산자 사용할 수 있다.
		// System.out.println(circle instanceof Rectangle);
		
		// interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	/*
	 * public static void drawPoint(Point point) { point.show(); }
	 * 
	 * public static void drawShape(Shape shape) { shape.draw(); }
	 */
	
	
	/*
	 * public static void drawColorPoint(ColorPoint point) { point.show(); }
	 * 
	 * public static void drawTriangle(Triangle triangle) { triangle.draw(); }
	 * 
	 * public static void drawRectangle(Rectangle rectangle) { rectangle.draw(); }
	 */
}
