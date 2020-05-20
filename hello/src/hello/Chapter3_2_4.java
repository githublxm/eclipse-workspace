package hello;

import java.util.Scanner;

public class Chapter3_2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number = in.nextInt();
		int result = 0;
		do
		{
			int digit = number%10;
			result = result*10+digit;
			number = number/10;
		}while(number>0);
		System.out.println(result);
	}

}
