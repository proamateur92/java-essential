package Chapter14_Lambda_Stream;

import java.util.*;

public class LambdaEx4_ex {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map1 = new HashMap<>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);

		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);
		map1.put(4, 400);
		
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		set.forEach(i->System.out.print(i));
		System.out.println();
		map.forEach((k,v)->System.out.print("{"+k+","+v+"}"));
		System.out.println();
		
		list.replaceAll(i->i*10);
		
		list.removeIf(i->i==0);
		set.removeIf(i->i%2==0);
		
		System.out.println(list);
		System.out.println(set);
		
		map.compute(1, (k,v)->v*10);
		System.out.println(map);
		int key = 5;
		
		map.computeIfAbsent(5, (k)->k.SIZE);
		System.out.println(map);
		
		map.computeIfPresent(3, (k,v)->v*10);
		System.out.println(map);
	
//		map1.forEach((k, y)->map.merge(k, y, (v1,v2)->v2));
//		System.out.println(map);

		map1.forEach((k, y)->map.merge(k, y, (v1,v2)->v1+v2));
		System.out.println(map);
		
		map1.forEach((k,v)->System.out.print(v/=10));
		System.out.println();
		
		map1.replaceAll((k,v)->v=0);
		System.out.println(map1);
	}

}
