package hello;

import java.util.Scanner;

public class Chapter4_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
//		int gcd = 1;
//		for (int i=2;i<=a&&i<=b;i++)
//		{
//			if(a%i == 0 && b % i == 0)
//			{
//				gcd = i;
//			}
//		}
//		System.out.println(gcd);
		int oa = a;
		int ob = b;
		while(b!=0)
		{
			int r = a%b;
			a = b;
			b = r;
		}
		System.out.println(a);
				
	}


}
