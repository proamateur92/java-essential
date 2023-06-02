package ch11;

class Parent {
	int x = 100;
	
	void print() {
		System.out.println("나는 조상 클래스야");
	}
}

class Child extends Parent{
	int x = 200;
	
	void print() {
		System.out.println("나는 자손 클래스야");
	}
}

public class Ex11_3 {
	public static void main(String[] args) {
		// 조상클래스와 자손클래스의 멤버변수가 중복 선언된 경우 참조 타입의 멤버변수를 따른다.
		// 메서드가 중복 선언된 경우 인스턴스 타입의 메서드를 따른다.
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x: " + p.x);
		System.out.println("c.x: " + c.x);
		
		p.print();
		c.print();
	}
}
