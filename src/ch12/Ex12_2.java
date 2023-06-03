package ch12;

abstract class Unit1 {
	int x, y;
	
	abstract void move(int x, int y);
	void stop() { /* 현재위치에 정지 */ };
}

class Marine1 extends Unit1 {
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	};
	void stimPack() { /* 스팀팩을 사용 */ };
}

class Tank1 extends Unit1 {
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	};
	void changeMode() { /* 공격모드를 변환 */ };
}

class Dropship1 extends Unit1 {
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	};
	void load() { /* 선택한 대상을 태윰 */ };
	void unload() { /* 선택한 대상을 낾 */ };
}

public class Ex12_2 {

	public static void main(String[] args) {
		Unit1[] unitGroup = new Unit1[4];
		
		unitGroup[0] = new Marine1();
		unitGroup[1] = new Tank1();
		unitGroup[2] = new Dropship1();
		unitGroup[3] = new Marine1();
		
		for(int i = 0; i < unitGroup.length; i++) {
			unitGroup[i].move(i + 100, i + 200);
		}

		for(int i = 0; i < unitGroup.length; i++) {
			System.out.println("x: " + unitGroup[i].x + ", y: " + unitGroup[i].y);
		}
	}	

}
