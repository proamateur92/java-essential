package ch08;

public class Point3D extends Point {	
	int z;
	
	Point3D() {
		this(100, 200, 300);
	}
	
	Point3D(int x, int y, int z) {
		// 조상의 생성자 Point(int x, int y)를 호출
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}
