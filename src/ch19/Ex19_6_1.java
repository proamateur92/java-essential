package ch19;

public class Ex19_6_1 {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}

		System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		
		System.out.println("소요시간2: " + (System.currentTimeMillis() - startTime));
	}

}


