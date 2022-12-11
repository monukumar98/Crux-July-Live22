package Lec51;

public class Cars {//implements Comparable<Cars> {

	int speed;
	int price;
	String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	@Override

	public String toString() {

		return "P=" + this.price + " S=" + this.speed + " C=" + this.color;
	}

//	@Override
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
////		if (o.price == this.price) { // rank
////			return this.color.compareTo(o.color);
////		} else {
////			return o.price - this.price;
////		}
//		return o.price - this.price;
//		// return this.color.compareTo(o.color);
//		// return this.speed - o.speed;// marks
//
//	}

}
