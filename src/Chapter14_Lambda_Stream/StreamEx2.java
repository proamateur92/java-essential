package Chapter14_Lambda_Stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		File[] fileArr = {new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt")}; 
		Stream<File> fileStream = Stream.of(fileArr);
	
		// map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);	// Stream<File> -> Stream<String>
		filenameStream.forEach(System.out::println);	// 모든 파일의 이름 출력
		System.out.println();
		
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
				.filter(s->s.indexOf(".")!=-1)	// 확장자 없는 이름 제거
				.map(s->s.substring(s.indexOf(".")+1))	// Strema<String> -> Stream<String>
				.map(String::toUpperCase)
				.distinct()
				.peek(System.out::println);
//				.forEach(System.out::println);	

					
		
	}

}
