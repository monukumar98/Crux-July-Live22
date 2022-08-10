package Lec7;

public class Type_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = (byte) (132);
		byte b2 = 15;

		System.out.println(b);
		int i = 3;
		short s = 677;
		// short b1 = (short) (i);
		byte b1 = (byte) (i);// 10 kg ko 5 kg me put krne pe error diya to Type CAst kra
		System.out.println(b1);

		byte b4 = 14;
		int ii = b4;// 5 kg ko 10 kg me put krne pe error nhi de raha h h
		System.out.println(ii);

		long x = 7612756238L;
		int ll1 = 2147483647;
		int l2 = 6;
		long c = ll1 + l2;
		System.out.println(c);

	}

}
