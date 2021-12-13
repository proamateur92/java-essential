package Chapter14_Lambda_Stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr)
		.parallel()
		.forEachOrdered(System.out::println);
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0); // 조건에 맞는 요소가 있으면 false
		Optional<String> sWord = Stream.of(strArr).parallel()
									.filter(s->s.charAt(0)=='s').findAny();
		
		System.out.println("noEmptyStr="+noEmptyStr);
		System.out.println("sWord="+sWord.get());
		
		// Stream<String>을 Stream<Integer>으로 변환(각 요소를 객체로 다룸)
		Stream<Integer> intStream0 = Stream.of(strArr).map(String::length);

		// Stream<String[]>을 IntStream으로 변환(각 요소를 기본형으로 다룸)
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0,(a,b)->a+1);
		int sum = intStream2.reduce(0,(a,b)->a+b);
		
		OptionalInt max = IntStream.empty().reduce(Integer::max);
//		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count="+count);
		System.out.println("sum="+sum);
		System.out.println("max.orElse="+max.orElse(1111));
		System.out.println("max.orElseGet="+max.orElseGet(()->0));
//		System.out.println("max="+max.getAsInt());
		System.out.println("min="+min.getAsInt());
	}

}
