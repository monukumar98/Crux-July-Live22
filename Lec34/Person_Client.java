package Lec34;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("hey");
		Person p1 = new Person("Raj", 22);
		Person p2 = new Person("Ravi", 21);
		p1.Intro_yourSelf();
		p2.Intro_yourSelf();
		
		p2.setName("Ankit");
		p2.Intro_yourSelf();
		System.out.println(p1.getAge());
		p1.setAge(-90);
		p1.Intro_yourSelf();
		
		

	}

}
