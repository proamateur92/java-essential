public class Ex6_1 {

	public static void main(String[] args) {
		Tv t1; 				// Tv 타입을 가지는 참조 변수 t1 선언
		t1 = new Tv();		// Tv 객체 주소 값을 tv1에 할당하여 인스턴스 생성
		t1.channel = 1;		// Tv의 채널을 1로 초기화
		t1.channelDown();	// Tv의 채널을 1 감소. 채널이 1 미만이면 10으로 초기화
		System.out.println("현재 채널은 " + t1.channel + "번 입니다.");
	}

}
