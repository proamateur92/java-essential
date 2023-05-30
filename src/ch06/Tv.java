package ch06;
public class Tv {
	// Tv의 속성 (멤버 변수)
	String color;	// 색상
	int channel;	// 채널
	boolean power;	// 전원 상태 on/off
	
	// Tv의 기능 (메서드)
	void power() { power = !power; } // tv 전원 on/off 하는 기능

	// tv 채널 증가하는 기능. 10을 넘어가면 1로 초기화
	void channelUp() { 
		if(channel > 10) {
			channel = 1;
			return;
		} 
		
		channel++; 
	}

	// tv 채널 감소하는 기능. 채널이 1을 미만이면 10으로 초기화
	void channelDown() { 
		if(channel == 1) {
			channel = 10;
			return;
		} 
		
		channel--; 
	}
	
}
