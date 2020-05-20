package hello;

import java.util.Scanner;

public class Chapter7_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int n = in.nextInt();
		int m = in.nextInt();
		int number ;
		if(n>m)
		{
			int r = n;
			n = m;
			m = r;
		}
		number = n;
		for(number=n;number<=m;number++)
		{
			for(int i=1;i<number/2+1;i++)
			{
				if(number%i==0)
				{
					sum+=i;
				}
			}
			if(sum==number)
			{
				System.out.print(number+" ");
			}
			sum = 0;
		}
		
	}


}
