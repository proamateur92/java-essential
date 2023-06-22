package ch19;

public class Ex19_8 {
	public static void main(String[] args) {
		ThreadEX8_1 t1 = new ThreadEX8_1();
		ThreadEX8_2 t2 = new ThreadEX8_2();
		
		t2.setPriority(10);
		
		System.out.println("t1 Priority(-)" + t1.getPriority());
		System.out.println("t2 Priority(|)" + t2.getPriority());
		
		t1.start();
		t2.start();

	}

}

class ThreadEX8_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 1000000; x++);
		}
	}
}

class ThreadEX8_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 1000000; x++);
		}
	}
}

