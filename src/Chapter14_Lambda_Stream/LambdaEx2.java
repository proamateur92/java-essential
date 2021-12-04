package Chapter14_Lambda_Stream;

@FunctionalInterface
interface MyFuction {
	void myMethod();	// public abstract void myMethod();
}

public class LambdaEx2 {

	public static void main(String[] args) {
		MyFunction f = ()->{};	// MyFunction f = (MyFunction)(()->{});
		Object obj = (MyFunction)(()->{});	// Object타입으로 형변환이 생략됨
		String str = ((Object)(MyFunction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{});	//에러. 람다식은 Object타입으로 형변환 안됨
		System.out.println((MyFunction)(()->{}));
//		System.out.println((MyFunction)(()->{})).toString());
		System.out.println(((Object)(MyFunction)(()->{})).toString());

//		실행결과: 일반적인 익명 객체라면, 객체의 타입이 '외부클래스이름$번호'와 같은 형식으로 타입이 결정됨.
//		람다식의 타입은 '외부클래스이름$$Lambda$번호'형식
//		Chapter14_Lambda_Stream.LambdaEx2$$Lambda$1/0x0000000800c00bf8@5674cd4d
//		Chapter14_Lambda_Stream.LambdaEx2$$Lambda$2/0x0000000800c01000@63961c42
//		Chapter14_Lambda_Stream.LambdaEx2$$Lambda$3/0x0000000800c01218@85ede7b
//		Chapter14_Lambda_Stream.LambdaEx2$$Lambda$4/0x0000000800c01430@1be6f5c3
//		Chapter14_Lambda_Stream.LambdaEx2$$Lambda$5/0x0000000800c01648@38af3868
	}

}
