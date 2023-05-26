class Konoha {
	int health;
	int chakra;
	boolean isShadow;
	
	void activeShadow() {
		
		if(!isShadow) { 
			System.out.println("! 해당 기술을 습득하지 못했습니다.");
			return;
		}
		
		if(chakra < 10) {
			System.out.println("! 차크라가 부족합니다.");
			return;
		}
		
		System.out.println("<<인법. 그림자 분신술!!>>");
		chakra-= 10; 
	}
	
	void chargeChakra() {
		chakra += 5;
		System.out.println("차크라가 " + (chakra - 5) +"에서 " + chakra + "(으)로 회복되었습니다.");
	}
}

public class Ex6_1_custom {
	public static void main(String[] args) {
		Konoha konohaSinobi1;
		konohaSinobi1 = new Konoha();
		
		konohaSinobi1.health = 10; 
		konohaSinobi1.chakra = 25;
		konohaSinobi1.isShadow = true;
	
		System.out.println("나뭇잎마을 닌자1의 체력: " + konohaSinobi1.health);
		System.out.println("나뭇잎마을 닌자1의 차크라: " + konohaSinobi1.chakra);
		System.out.println("나뭇잎마을 닌자1의 그림자분신술 소유 여부: " + (konohaSinobi1.isShadow ? "예" : "아니오"));
		
		konohaSinobi1.activeShadow();
		System.out.println("나뭇잎마을 닌자1의 차크라 " + konohaSinobi1.chakra);
		konohaSinobi1.chargeChakra();
		System.out.println("======================================================");
		
		Konoha konohaSinobi2 = new Konoha();
		
		konohaSinobi2.health = 5; 
		konohaSinobi2.chakra = 15;
	
		System.out.println("나뭇잎마을 닌자2의 체력: " + konohaSinobi2.health);
		System.out.println("나뭇잎마을 닌자2의 차크라: " + konohaSinobi2.chakra);
		System.out.println("나뭇잎마을 닌자2의 그림자분신술 소유 여부: " + (konohaSinobi2.isShadow ? "예" : "아니오"));
		
		konohaSinobi2.activeShadow();
		System.out.println("나뭇잎마을 닌자2의 차크라 " + konohaSinobi2.chakra);
	}
}