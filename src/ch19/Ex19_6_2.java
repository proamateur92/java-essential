package ch19;

public class Ex19_6_2 {
	
	public static void main(String[] args) {
		ThreadTest6 t1 = new ThreadTest6();
		t1.start();
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}

		System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
	}

}

class ThreadTest6 extends Thread {
	long startTime = System.currentTimeMillis();
	
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		
		System.out.println("소요시간2: " + (System.currentTimeMillis() - startTime));
	}
}

