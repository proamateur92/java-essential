package ch19;

public class Ex19_3 {

	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1();
		
		Runnable r = new ThreadTest2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}

class ThreadTest1 extends Thread {
	public void run() {
		System.out.println("class called");
		
		for(int i = 0; i < 500; i++) {
//			System.out.println(getName());	// this.getName()
			System.out.print(0);	// this.getName()
		}
	}
}

class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		System.out.println("interface called");
		
		for(int i = 0; i < 500; i++) {
			// Thread.currentHead 현재 실행중인 Thread를 반환한다.
//			System.out.println(Thread.currentThread().getName());
			System.out.print(1);
		}
	}
	
}