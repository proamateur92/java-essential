package ch06;
public class ParameterTest1 {

	public static void main(String[] args) {
		// 기본형 매개변수는 heap메모리의 인스턴스에 영향을 줄 수 없다.
		Data d = new Data();
		d.x = 10;
		
		System.out.println("변경 전 d.x 값:  " + d.x);
		
		change(d.x);
		System.out.println("변경 후 d.x 값:  " + d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("x 값: " + x);
	}
}
