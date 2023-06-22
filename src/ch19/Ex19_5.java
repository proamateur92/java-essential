package ch19;

public class Ex19_5 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEX5_1 t1 = new ThreadEX5_1();
		ThreadEX5_2 t2 = new ThreadEX5_2();
		
		t1.start();
		t2.start();

		startTime = System.currentTimeMillis();
		
		try {
			t1.join();	// main 쓰레드가 t1의 작업이 끝날 때까지 기다린다.
			t2.join();	// main 쓰레드가 t2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		
		System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
	}

}

class ThreadEX5_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class ThreadEX5_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

