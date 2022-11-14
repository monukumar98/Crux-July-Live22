package Lec42;

public class String_Bulid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append('c');
		sb.append("Hello");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		System.out.println(sb.reverse());
		System.out.println(sb);
		String s = "hellobye";
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.append("hellobye");
		sb1.append("hellobye");
		sb1.append("cc");
		System.out.println(sb1);
		System.out.println(sb1.length() + " " + sb1.capacity());
		// sb1.append(2,'c');
		sb1.setCharAt(0, 't');
		System.out.println(sb1);

//		System.out.println(sb1.indexOf("he"));
//		System.out.println(sb1);
//		System.out.println(sb1.delete(1, 3));
//		System.out.println(sb1.charAt(5));

	}

}
