package hello;

import java.util.Scanner;

public class Chapter4_4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������1��200֮�����������");
		int n = in.nextInt();
		int m = in.nextInt();
		boolean isPrime = true;
		int w = 2;
		int j = 0;
		int sum = 0;		
		while(j<m)
		{
			isPrime = true;
			{
				int i;
				for(i=2;i<w;i++)//�ж�����
				{
					if(w%i==0)
					{
						isPrime = false;
						break;
					}	
					
				}
				if(isPrime)
				{
					j++;
					if(j>=n&&j<=m)
					{
						sum = sum + w;
					}
				}
				w++;
			}
		}
		System.out.println(sum);
			
		
	}
}
