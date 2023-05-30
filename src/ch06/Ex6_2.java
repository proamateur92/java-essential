package ch06;
public class Ex6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	// 0x100
		Tv t2 = new Tv();	// 0x200

		t1.channel = 7;	
		
		System.out.println("t1�� ���� ä���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("t2�� ���� ä���� " + t2.channel + "�� �Դϴ�.");

		// ��ü t2�� t1�� �ּ� ���� �Ҵ��� ���.
		// t2�� t1�� ��ü �ּҸ� ����Ű�� �ȴ�.
		// ������ t2 0x200 ��ü ���� �����Ǹ� �� �̻� ����� �� ����.
		
		// t2 = 0x100
		t2 = t1;

		System.out.println("t1�� ���� ä���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("t2�� ���� ä���� " + t2.channel + "�� �Դϴ�.");
	}

}
