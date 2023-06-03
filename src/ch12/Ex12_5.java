package ch12;

interface Repairable {}

class GroundUnit extends Unit{
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}
	
	public String toString() {
		return "Tank";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
	}
	
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
//				System.out.println("수리합니다.");
				u.hitPoint++;
			}
		} else {
			System.out.println("대상을 수리할 수 없습니다.");
		}
	}
	
	public String toString() {
		return "SCV";
	}
}

public class Ex12_5 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
//		scv.repair(marine); // 에러!! repair 함수는 Repairable 타입을 매개변수로 받는다. 
	}

}
