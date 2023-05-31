package ch06;

public class Ex6_12_Constructor4 {

	public static void main(String[] args) {
		Candy c1 = new Candy();
		Candy c2 = new Candy("grape", 4, 6);
		
		System.out.println(c1.name + " candy, " + c1.weight +"g, sugars: " + c1.sugars);
		System.out.println(c2.name + " candy, " + c2.weight +"g, sugars: " + c2.sugars);
	}

}
