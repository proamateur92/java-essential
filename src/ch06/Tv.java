package ch06;
public class Tv {
	// Tv�� �Ӽ� (��� ����)
	String color;	// ����
	int channel;	// ä��
	boolean power;	// ���� ���� on/off
	
	// Tv�� ��� (�޼���)
	void power() { power = !power; } // tv ���� on/off �ϴ� ���

	// tv ä�� �����ϴ� ���. 10�� �Ѿ�� 1�� �ʱ�ȭ
	void channelUp() { 
		if(channel > 10) {
			channel = 1;
			return;
		} 
		
		channel++; 
	}

	// tv ä�� �����ϴ� ���. ä���� 1�� �̸��̸� 10���� �ʱ�ȭ
	void channelDown() { 
		if(channel == 1) {
			channel = 10;
			return;
		} 
		
		channel--; 
	}
	
}
