package ch11;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}

class Phone extends Product {
	Phone() {
		super(50);
	}
	
	public String toString() {
		return "Phone";
	}
}

class Watch extends Product {
	Watch() {
		super(15);
	}
	
	public String toString() {
		return "Watch";
	}
}

class Buyer {
	int money = 500;
	int bonusPoint  = 0;
	
	Product[] cart = new Product[10];
	
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		if(i > 10) {
			System.out.println("더이상 장바구니에 담을 수 없습니다.");
			return;
		}
		
		System.out.println("["+ p +"]을/를 구매합니다.\n");
		money -= p.price;
		bonusPoint += p.bonusPoint;		
		cart[i++] = p;
	}
	
	void leftMoney() {
		System.out.println("money: " + money + ", bonusPoint: " + bonusPoint);
	}
	
	void summury() {
		String itemList = "";
		int sumPrice = 0;
		int sumPoint = 0;
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			
			itemList += "[" + cart[i] +"]: " + cart[i].price + "￦ \n";
			sumPrice += cart[i].price;
			sumPoint+= cart[i].bonusPoint;
		}
		
		System.out.println();
		System.out.println("총 금액: " + sumPrice + "￦");
		System.out.println("총 포인트: " + sumPoint + "p");
		System.out.println();
		System.out.println("총 구매 리스트");
		System.out.println(itemList);
	}
}

public class Ex11_4 {

	public static void main(String[] args) {
		Product p1 = new Tv();
		Product p2 = new Phone();
		Watch p3 = new Watch();
		
		Buyer b = new Buyer();
		
		b.leftMoney();
		
		b.buy(p1);
		b.leftMoney();

		b.buy(p2);
		b.leftMoney();

		b.buy(p3);
		b.leftMoney();

		b.buy(p1);
		b.leftMoney();
		
		b.buy(p1);
		b.leftMoney();
		
		b.buy(new Tv());
		b.leftMoney();
		
		b.buy(new Tv());
		b.leftMoney();
		
		b.summury();
	}

}
