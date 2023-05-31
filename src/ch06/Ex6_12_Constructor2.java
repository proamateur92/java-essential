package ch06;

class Cookie {
	String name;
	int weight;
	int sugars;
	
	Cookie(String n, int w, int s) {
		name = n;
		weight = w;
		sugars = s;
	}
}

public class Ex6_12_Constructor2 {

	public static void main(String[] args) {
		Cookie c1 = new Cookie("amond", 15, 5);
		Cookie c2 = new Cookie("chocolate", 10, 25);
		
		System.out.println(c1.name + " cookie, " + c1.weight +"g, sugars: " + c1.sugars);
		System.out.println(c2.name + " cookie, " + c2.weight +"g, sugars: " + c2.sugars);
	}

}
