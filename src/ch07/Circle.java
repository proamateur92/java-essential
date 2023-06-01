package ch07;

public class Circle extends Shape{
	Point center;
	int r;
	
	Circle() {
		this(new Point(0, 0), 100);
	}
	
	Circle(Point p, int r) {
		this.center = p;
		this.r = r;
	}
}
