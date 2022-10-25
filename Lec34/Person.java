package Lec34;

public class Person {

	private String name = "Anish";
	private int age = 22;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);
	}

	public Person() {
		this.name = "Amisha";
		this.age = 21;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
		
			return;
		}
		this.age = age;
	}

//	public Person() {
//
//	}

}
