package ch06;

class MyMath {
	long a, b;
	
	long add() {	// 인스턴스 메서드
		System.out.println("인스턴스메서드 호출");
		return a + b;
	}
	
	static long add(long a, long b) {	// 클래스메서드(static메서드)
		System.out.println("static메서드 호출");
		return a + b;
	}
}
