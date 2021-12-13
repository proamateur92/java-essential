package Chapter14_Lambda_Stream;

import java.util.Optional;

public class OptionalEx0 {

	public static void main(String[] args) {
//		int[] arr = null;	// nullPointExcpetion
		int[] arr = new int[0];
		System.out.println("arr.length = "+arr.length);

//		Optional<String> opt = null; // OK. 하지만 바람직X
		Optional<String> opt = Optional.empty();
		System.out.println("opt ="+opt);
//		System.out.println("opt.get()="+opt.get());
		
		String str = "";

//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = ""; // 예외가 발생하면 빈문자열로 초기화
//		} // 예외발생
		
//		str = opt.orElse("empty"); // Optional에 저장된 값이 null이면 빈문자열 반환
//		str = opt.orElseGet(()->new String());
		str = opt.orElseGet(String::new);
		System.out.println("str = "+str);
		
	}

}
