package ch06;

class Candy {
	String name;
	int weight;
	int sugars;
	
	Candy() {
		this("basic", 5, 5);
	}
	
	Candy(String n, int w, int s) {
		name = n;
		weight = w;
		sugars = s;
	}
	
	Candy(Candy c) {
		this(c.name, c.weight, c.sugars);

//		this.name = c.name;
//		this.weight = c.weight;
//		this.sugars = c.sugars;
	}
}

public class Ex6_12_Constructor3 {

	public static void main(String[] args) {
		Candy c1 = new Candy();
		Candy c2 = new Candy(c1);
		
		System.out.println(c1.name + " candy, " + c1.weight +"g, sugars: " + c1.sugars);
		System.out.println(c2.name + " candy, " + c2.weight +"g, sugars: " + c2.sugars);
	}

}
