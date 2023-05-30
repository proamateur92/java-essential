package ch06;

public class MyMathTest {	
	public static void main(String[] args) {
		
		System.out.println(MyMath.add(200L, 100L));	// static 메서드 호출
		MyMath mm = new MyMath();

		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());	// 인스턴스 메서드 호출. *매개변수 주의하기 
	}
} 
