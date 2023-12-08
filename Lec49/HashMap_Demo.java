package Lec49;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// Integer a = 19;
		// put O(1)
		map.put("Raj", 98);
		map.put("Ankit", 77);
		map.put("Amisha", 67);
		map.put("Puneet", 56);
		map.put("Riya", 78);
		map.put("Kaju", 98);
		map.put("Kunal", 17);
		map.put("Deepak", -90);
		map.put("Amisha", 77);
		 map.put(null, 77);
		System.out.println(map);
// way 1
//		Set<String> s = map.keySet();
//		System.out.println(s.size());
//
//		for (String key : s) {
//			System.out.println(key + " " + map.get(key));
//		}

		// way 2
//		for (String key : map.keySet()) {
//			System.out.println(key + " " + map.get(key));
//		}
//		System.out.println();
//		// way 3
//		ArrayList<String> ll = new ArrayList<>(map.keySet());
//		for (String key : ll) {
//			System.out.println(key + " " + map.get(key));
//		}

//
//		// contains
//		// O(1)
//		System.out.println(map.containsKey("Puneet"));
//		System.out.println(map.containsKey("Puneeti"));
//
//		// get
//		// O(1)
//		System.out.println(map.get("Amisha"));
//		System.out.println(map.get("Puneeti"));
//		// remove
//		// O(1)
//		System.out.println(map.remove("Amisha"));
//		System.out.println(map.get("Puneeti"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// put log(N)
		map1.put("Raj", 98);
		map1.put("Ankit", 77);
		map1.put("Amisha", 67);
		map1.put("Puneet", 56);
		map1.put("Riya", 78);
		map1.put("Kaju", 98);
		map1.put("Kunal", 17);
		map1.put("Deepak", -90);
		map1.put("Amisha", 77);
		// map.put(null, 77);
		 System.out.println(map1);

		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// put O(1)
		map2.put("Raj", 98);
		map2.put("Ankit", 77);
		map2.put("Amisha", 67);
		map2.put("Puneet", 56);
		map2.put("Riya", 78);
		map2.put("Kaju", 98);
		map2.put("Kunal", 17);
		map2.put("Deepak", -90);
		map2.put("Amisha", 77);
		// map.put(null, 77);
		 System.out.println(map2);

	}

}
