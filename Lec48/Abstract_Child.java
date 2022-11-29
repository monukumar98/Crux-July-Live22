package Lec48;

public class Abstract_Child extends Abstract_Demo {

	@Override
	public void fun() {
		// TODO Auto-generated method stub

	}

	public void add() {
		// TODO Auto-generated method stub
		System.out.println(2 + 3);

	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Abstract_Child a = new Abstract_Child();
		a.SayHey();
		a.add();
	}

}
