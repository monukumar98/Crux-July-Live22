package Lec49;

import java.util.*;

public class Set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s = new HashSet<>();
		s.add(12);
		s.add(-2);
		s.add(1);
		s.add(9);
		s.add(11);
		s.add(7);
		s.add(2);
		s.add(-108);
		s.add(null);
		System.out.println(s);

//		System.out.println(s.contains(11));
//		System.out.println(s.remove(-2));
//		
//		System.out.println(s);
		TreeSet<Integer> s1 = new TreeSet<>();
		s1.add(12);
		s1.add(-2);
		s1.add(1);
		s1.add(9);
		s1.add(11);
		s1.add(7);
		s1.add(2);
		s1.add(-108);
//		s1.add(null);
		System.out.println(s1);
		
		LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
		s2.add(12);
		s2.add(-2);
		s2.add(1);
		s2.add(9);
		s2.add(11);
		s2.add(7);
		s2.add(2);
		s2.add(-108);
		s2.add(null);
		System.out.println(s2);
		
		
		
		
		

	}

}
