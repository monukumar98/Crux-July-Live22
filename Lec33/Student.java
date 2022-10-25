package Lec33;

public class Student {
	String name;
	int age;
	static int countofstudent;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);

	}

	public void SayHey(String name) {

		System.out.println(name + " Say Hey " + this.name);

	}

	public static void fun() {
     System.out.println("I am in Fun");
	}
	static {
		System.out.println("Hey All Welcome to Coding Blocks");
	}


}
