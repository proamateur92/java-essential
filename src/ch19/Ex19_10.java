package ch19;

public class Ex19_10 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Ex19_10());
		t1.setDaemon(true);
		t1.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("main= " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i == 5) {
				autoSave = true;
			}
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}

	@Override
	public void run() {
		while(true) { // 무한루프
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			
			if(autoSave) autoSave();
		}
	}

	void autoSave() {
		System.out.println("파일을 저장했습니다.");
	}
}

