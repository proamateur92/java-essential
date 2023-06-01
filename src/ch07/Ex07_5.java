package ch07;

public class Ex07_5 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point(150, 150), 50);
		
		Point[] p = {new Point(100, 100), new Point(140, 50), new Point(200, 100)};
		Triangle t1 = new Triangle(p);
		
		System.out.println("x: " + c1.center.x + " y: "+ c1.center.y + " r: " +  c1.r);
		System.out.println("x: " + c2.center.x + " y: "+ c2.center.y + " r: " +  c2.r);
		System.out.println("[0]: " + t1.p[0].x + ", " + t1.p[0].y + " [1]: " + t1.p[1].x + ", " + t1.p[1].y + " [2]: " + t1.p[2].x + ", " + t1.p[2].y);
	}

}
