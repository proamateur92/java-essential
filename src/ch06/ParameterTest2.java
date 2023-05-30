package ch06;
public class ParameterTest2 {

	public static void main(String[] args) {
		// 참조형 매개변수는 heap메모리의 인스턴스에 영향을 준다.
		Data d = new Data();
		d.x = 10;
		
		System.out.println("���� �� d.x��: " + d.x);
		
		change(d);
		System.out.println("���� �� d.x��: " + d.x);
	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("d.x ��: " + d.x);
	}
}
