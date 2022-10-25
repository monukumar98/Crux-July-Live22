package Lec34;

public class Student {
	private String name = "Anish";
	private int age = 22;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;

	}

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);
	}

	public int getAge() {

		return age;
	}

//	public void setAge  (int age) throws Exception{
//		if(age<0) {
//		throw new Exception("Bklol Age kabhi -ve nhi hota hai ");
//		}
//		this.age = age;
//		
//	}
	public void setAge(int age) {
		try {
			System.out.println("In Try ");
			if (age < 0) {
				throw new Exception("Bklol Age kabhi -ve nhi hota hai ");
			}
			this.age = age;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("In Catch ");
			e.printStackTrace();
			// System.out.println(e);

		}
		finally {
			System.out.println("I am in finaly  blocks");
		}

	}

}
