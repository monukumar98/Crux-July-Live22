package Lec34;

public class Student_Client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student("Ravi", 24);
		s.Intro_yourSelf();
		s.setAge(-90);
		System.out.println("Bye");
		s.Intro_yourSelf();
		

	}

}
