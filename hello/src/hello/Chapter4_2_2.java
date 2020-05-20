package hello;

import java.util.Scanner;

public class Chapter4_2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n =2;
//		int m = 0;
//		while(m<=50)
//		{
//			boolean isprime = true;
//			for(int i=2;i<n;i++) {
//				if(n%i==0)
//				{
//					isprime = false;
//				}
//			}
//			if (isprime)
//			{
//				System.out.print(n+" ");
//				m++;
//			}
//			n++;
//		}
		int amount = in.nextInt();
		OUT:
		for(int one=0;one<=amount;++one)
		{
			for(int five=0;five<=amount/5;five++)
			{
				for(int ten=0;ten<=amount/10;ten++)
				{
					for(int twenty=0;twenty<=amount/20;++twenty)
					{
						if(one+five*5+ten*10+twenty*20==amount)
						{
							System.out.println(one+"张1元，"+five+"张5元，"+ten+"张10元，"+twenty+"张20元");
							break OUT;
						}
					}
				}
			}
		}
	}
}
