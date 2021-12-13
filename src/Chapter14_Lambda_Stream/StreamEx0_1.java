package Chapter14_Lambda_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx0_1 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 10);
//		intStream.skip(3).limit(5).forEach(System.out::print);
	
		intStream.filter(i->i%2!=0&&i%3!=0).forEach(System.out::print);
//		intStream.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);
		System.out.println();
		
		Stream<String> strStream = Arrays.stream(new String[] {"a","b","c","c","a"});
		strStream.distinct().forEach(System.out::print);
		System.out.println();
		
		
	}

}
