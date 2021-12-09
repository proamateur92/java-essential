package Chapter14_Lambda_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx0 {

	public static void main(String[] args) {
		// List -> Stream
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();	// list를 Stream 데이터 생성
		intStream.forEach(System.out::print);	// forEach()최종연산
		System.out.println();
		
		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream을 생성
		intStream = list.stream();
		intStream.forEach(System.out::print);
		System.out.println();
		
		// Array -> Stream
		Stream<String> strStream = Stream.of("a","b","c"); // 기본 인자
		Stream<String> strStream1 = Stream.of(new String[] {"a","b","c"});
		Stream<String> strStream2 = Arrays.stream(new String[] {"a","b","c"});
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"},0,3);
		strStream3.forEach(System.out::print);
		System.out.println();
		
		IntStream intStream1 = IntStream.of(1,2,3);
		IntStream intStream2 = IntStream.of(new int[] {1,2,3});
		IntStream intStream3 = Arrays.stream(new int[] {1,2,3,});
		IntStream intStream4 = Arrays.stream(new int[] {1,2,3},1,3);
		intStream4.forEach(System.out::print);
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream is = Arrays.stream(intArr,0,2);
//		IntStream is = IntStream.of(intArr);
//		is.forEach(System.out::print);
//		System.out.print("count= "+is.count());
		System.out.print("sum= "+is.sum());
//		System.out.print("average= "+is.average());
		System.out.println();
		
//		IntStream randomStream = new Random().ints();
//		randomStream.limit(5).forEach(System.out::println);
		
		IntStream randomStream = new Random().ints(5, 5, 10);
		randomStream.forEach(System.out::println);
		System.out.println();

		//특정 범위의 정수
		IntStream rangeStream = IntStream.range(1, 5);
		rangeStream.forEach(System.out::println);
		System.out.println();
		
		IntStream rangeStream1 = IntStream.rangeClosed(1, 5);
		rangeStream1.forEach(System.out::println);
		System.out.println();
		
		//iterate() 이전 요소에 종속적, generate() 이전 요소에 독립적. 무한스트림
		//iterate(T seed, UnaryOperator f) 단항 연산자
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
		evenStream.limit(5).forEach(System.out::print);
		
		// generate(Supplier s)
		Stream<Double> randomStream1 = Stream.generate(Math::random);
		randomStream1.limit(5).forEach(System.out::print);
		System.out.println();
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(20).forEach(System.out::print);
		System.out.println();
		
		
	}

}
