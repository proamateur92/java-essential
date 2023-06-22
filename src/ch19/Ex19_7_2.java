package ch19;

import java.util.Scanner;

public class Ex19_7_2 {
	
	public static void main(String[] args)  {
		ThreadTest7 t1 = new ThreadTest7();
		t1.start();
		
		System.out.println("아무 값이나 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println("입력하신 값은 " + input + "입니다.");
		
	}

}

class ThreadTest7 extends Thread {
	public void run () {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
