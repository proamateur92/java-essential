package ch10;

final class Singleton {
	private static  Singleton s = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("[out] s: " + s);
		if(s == null) {
			System.out.println("[in] s: " + s);
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();	// 에러! 생성자의 접근제어자로(private) 인해 생성자 호출 불가능
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
	}
}
