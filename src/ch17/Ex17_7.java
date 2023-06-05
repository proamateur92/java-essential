package ch17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex17_7 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		ArrayList list2 = null;
		
		// ArrayList에는 객체만 저장 가능하다.
		// autoBoxing에 의해 기본현이 참조형으로 자동 변환
//		list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2)= " + list1.containsAll(list2) + "\n");
		
		list2.add('B');
		list2.add('C');
		
		// 요소를 치환한다.
		list2.set(2, 'A');
		print(list1, list2);
		
		// remove(Object obj)
		list1.remove(new Integer(4));
		// remove(int index)
		list1.remove(1);
		print(list1, list2);
		
		list1.retainAll(list2);
		System.out.println("list1.retainAll(list2)= " + list1 + "\n");
		
		for(int i = 0; i < list1.size(); i++) {
			if(list2.contains(list1.get(i))) {
				list2.remove(list1.get(i));
			}
		}
		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2 + "\n");
	}
}
