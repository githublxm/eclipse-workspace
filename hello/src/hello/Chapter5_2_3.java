package hello;

import java.util.Scanner;

public class Chapter5_2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int[] primes = new int[50];
//		primes[0] = 2;
//		int cnt = 1;
//		MAIN_LOOP:
//		for( int x =3;cnt<50;x++)
//		{
//			for(int i=0;i<cnt;i++)
//			{
//				if(x%primes[i]==0)
//				{
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x;
//		}
//		for (int k:primes)
//		{
//			System.out.println(k+" ");
//		}
		
		boolean[] isPrime = new boolean[100];
		for(int i=0;i<isPrime.length;i++)
		{
			isPrime[i] = true;
		}
		for(int i = 2;i<isPrime.length;i++)
		{
			for(int k = 2;i*k<isPrime.length;k++)
			{
				isPrime[i*k] = false;
			}
		}
		for(int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
	}


}
