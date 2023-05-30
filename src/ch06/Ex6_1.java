package ch06;
public class Ex6_1 {

	public static void main(String[] args) {
		Tv t1; 				// Tv Ÿ���� ������ ���� ���� t1 ����
		t1 = new Tv();		// Tv ��ü �ּ� ���� tv1�� �Ҵ��Ͽ� �ν��Ͻ� ����
		t1.channel = 1;		// Tv�� ä���� 1�� �ʱ�ȭ
		t1.channelDown();	// Tv�� ä���� 1 ����. ä���� 1 �̸��̸� 10���� �ʱ�ȭ
		System.out.println("���� ä���� " + t1.channel + "�� �Դϴ�.");
	}

}
