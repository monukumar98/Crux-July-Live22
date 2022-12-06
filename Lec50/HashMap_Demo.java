package Lec50;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Aditi", 20);
		map.put("Kunal", 10);
		map.put("Ankita", 6);
		map.put("Kamlesh", 16);
		map.put("Raj", 60);
		map.put("Amisha", 78);
		map.put("Nitish", 610);
		System.out.println(map.containsKey("Aditi"));
		System.out.println(map.get("Aditi"));
		System.out.println(map);
		System.out.println(map.remove("Kamlesh"));
		System.out.println(map);

	}

}
