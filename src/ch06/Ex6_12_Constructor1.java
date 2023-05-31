package ch06;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) {
		value = x;
	}
}

public class Ex6_12_Constructor1 {

	public static void main(String[] args) {
		
		// 클래스에 생성자를 명시하지 않으면 컴파일러가 기본 생성자를 만들어준다.
		Data1 d1 = new Data1();
		
		// The constructor Data2() is undefined
		// 클래스에 생성자를 명시한 경우 기본 생성자(파라미터가 없는)를 자동 생성하지 않는다.
		// Data2 d2 = new Data2();
	}

}
