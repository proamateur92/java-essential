package ch10;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time() {
		this(0, 0, 0);
	}
	
	Time(int hour, int mintute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() { 
		return hour; 
	}
	
	public void setHour(int hour) {
		if (hour < 0) {
			this.hour = 24 - hour;
			return;
		}

		if (hour > 23) {
			this.hour = hour - 24;
			return;
		}
		
		this.hour = hour;
	}

	public int getSecond() { 
		return second; 
	}
	
	public void setSecond(int second) {
		if (hour < 0 || hour > 59) return;
		this.second = second;
	}
	
	public int getMinute() { 
		return minute; 
	}
	
	public void setMinute(int minute) {
		if (hour < 0 || hour > 59) return;
		this.minute = minute;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}

public class AccessModifier {
	public static void main(String[] args) {
		Time t = new Time(23, 59, 44);
		System.out.println(t);
		// t.hour = 13; // 에러!
		
		// 현재 시간 + 1시간
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}

}
