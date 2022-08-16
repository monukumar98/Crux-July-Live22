package Lec8;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrongNumber(n));

	}

	
	public static boolean IsArmstrongNumber(int n) {
         int cod = countofdigit(n);
         
         int x=n;
         int ans=0;
         while(n>0) {
        	 int rem = n%10;
        	 ans = (int) (ans + Math.pow(rem, cod));
        	 n=n/10;
         }
         if(ans==x) {
        	 return true;
         }
         else {
        	 return false;
         }
        		 
	}
	
	public static int countofdigit(int n) {
		
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}

}
