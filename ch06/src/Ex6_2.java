public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	// 0x100
		Tv t2 = new Tv();	// 0x200

		t1.channel = 7;	
		
		System.out.println("t1의 현재 채널은 " + t1.channel + "번 입니다.");
		System.out.println("t2의 현재 채널은 " + t2.channel + "번 입니다.");

		// 객체 t2에 t1의 주소 값을 할당한 경우.
		// t2도 t1의 객체 주소를 가르키게 된다.
		// 기존의 t2 0x200 객체 값은 삭제되며 더 이상 사용할 수 없다.
		
		// t2 = 0x100
		t2 = t1;

		System.out.println("t1의 현재 채널은 " + t1.channel + "번 입니다.");
		System.out.println("t2의 현재 채널은 " + t2.channel + "번 입니다.");
	}

}
