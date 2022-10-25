package Lec33;

import java.util.ArrayList;

public class StudentClint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello bye");
		Student s = new Student();
		Student s1 = new Student();
		s.name = "Kaju";
		s.age = 21;
		s1.name = "katli";
		s1.age = 22;
		s.Intro_yourSelf();
		s1.Intro_yourSelf();
		s.SayHey("Priya");
		System.out.println(s1.name);
		s1.SayHey("Priya");
		int x = Student.countofstudent;
		Student.fun();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list.add(1);
		list1.add(2);

		
	}
	
	static {
		System.out.println("Hey All Welcome to Coding Blocks");
	}
}
