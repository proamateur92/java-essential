package ch06;
class Konoha {
	int health;
	int chakra;
	boolean isShadow;
	
	void activeShadow() {
		
		if(!isShadow) { 
			System.out.println("! �ش� ����� �������� ���߽��ϴ�.");
			return;
		}
		
		if(chakra < 10) {
			System.out.println("! ��ũ�� �����մϴ�.");
			return;
		}
		
		System.out.println("<<�ι�. �׸��� �нż�!!>>");
		chakra-= 10; 
	}
	
	void chargeChakra() {
		chakra += 5;
		System.out.println("��ũ�� " + (chakra - 5) +"���� " + chakra + "(��)�� ȸ���Ǿ����ϴ�.");
	}
}

public class Ex6_1_custom {
	public static void main(String[] args) {
		Konoha konohaSinobi1;
		konohaSinobi1 = new Konoha();
		
		konohaSinobi1.health = 10; 
		konohaSinobi1.chakra = 25;
		konohaSinobi1.isShadow = true;
	
		System.out.println("�����ٸ��� ����1�� ü��: " + konohaSinobi1.health);
		System.out.println("�����ٸ��� ����1�� ��ũ��: " + konohaSinobi1.chakra);
		System.out.println("�����ٸ��� ����1�� �׸��ںнż� ���� ����: " + (konohaSinobi1.isShadow ? "��" : "�ƴϿ�"));
		
		konohaSinobi1.activeShadow();
		System.out.println("�����ٸ��� ����1�� ��ũ�� " + konohaSinobi1.chakra);
		konohaSinobi1.chargeChakra();
		System.out.println("======================================================");
		
		Konoha konohaSinobi2 = new Konoha();
		
		konohaSinobi2.health = 5; 
		konohaSinobi2.chakra = 15;
	
		System.out.println("�����ٸ��� ����2�� ü��: " + konohaSinobi2.health);
		System.out.println("�����ٸ��� ����2�� ��ũ��: " + konohaSinobi2.chakra);
		System.out.println("�����ٸ��� ����2�� �׸��ںнż� ���� ����: " + (konohaSinobi2.isShadow ? "��" : "�ƴϿ�"));
		
		konohaSinobi2.activeShadow();
		System.out.println("�����ٸ��� ����2�� ��ũ�� " + konohaSinobi2.chakra);
	}
}