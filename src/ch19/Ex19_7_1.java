package ch19;

import java.util.Scanner;

public class Ex19_7_1 {
	
	public static void main(String[] args)  {
		System.out.println("아무 값이나 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}

}


