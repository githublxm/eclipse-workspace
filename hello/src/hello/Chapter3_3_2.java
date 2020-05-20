package hello;

import java.util.Scanner;

public class Chapter3_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入正整数：");
		int x = 0;
		int n = 1;
		int i = 0;
//		int m = 0;
		int bit = 0;
		System.out.println("请输入一个正整数：");
		int number = in.nextInt();
		do
		{
			x = number%10;
			number=number/10;
			if(x%2==0 && n%2==0 || x%2!=0 && n%2!=0)
			{
				i = 1;
			}
			else
			{
				i = 0;
			}
			bit = (int)(i*Math.pow(2, (n-1))+bit);
			n++;			
			
		}while(number/10>0);
		System.out.println(bit);
	}
}
