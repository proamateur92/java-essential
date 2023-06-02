package ch11;

class Animal {
	int legs;
	String color;
	
	void growl() {
		System.out.println("gorwl~~~~");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I believe, I can fly");
	}
}

public class Ex11_1 {
	public static void main(String[] args) {
		Animal a = null;
		Bird b1 = new Bird();
		Bird b2 = null;
		
		a = b1;
		b2 = (Bird)a;
		// 조상클래스는 자손클래스의 멤버변수의 수가 부족하다.
		// 따라서, 조상클래스의 인스턴스에서 조상타입의 참조변수로 값을 할당할 때 형변환을 명시해주어야 한다.
		// b2 = a; // 에러 발생!
		b2.fly();
		
		// instanceof 연산자 테스트
		if(b1 instanceof Bird) {
			System.out.println("Bird객체의 인스턴스입니다.");
		}

		if(b1 instanceof Animal) {
			System.out.println("Animal객체의 인스턴스입니다.");
		}
		
		if(b1 instanceof Bird) {
			System.out.println("Object객체의 인스턴스입니다.");
		}
	}

}
