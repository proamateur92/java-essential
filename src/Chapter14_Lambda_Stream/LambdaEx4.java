package Chapter14_Lambda_Stream;

import java.util.*;

public class LambdaEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) 
			list.add(i);
		
		// list의 모든 요소 출력
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		
		// list의 2 또는 3의 배수 제거
		list.removeIf(i->i%2==0||i%3==0);
		System.out.println(list);
		
		// list의 각 요소에 x10
		list.replaceAll(i->i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//	map의 모든 요소를 key, value 형식으로 출력
		map.forEach((k, v)->System.out.print("{"+k+","+v+"}"));
	}

}
