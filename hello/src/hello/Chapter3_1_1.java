package hello;

import java.util.Scanner;

public class Chapter3_1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
		while(true)
		{
			System.out.println("请投币：");
			int amount = in.nextInt();
			balance = balance + amount;
			if(balance>=10)
			{
				System.out.println("**************");
				System.out.println("*java城际铁路专线*");
				System.out.println("*无指定座位票*");
				System.out.println("*票价：10元*");
				System.out.println("**************");
				//计算并带你找零
				System.out.println("找零："+(balance-10));
				balance = 0;
			}
		}
	}

}
