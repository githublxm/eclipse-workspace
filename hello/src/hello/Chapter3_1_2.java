package hello;

import java.util.Scanner;

public class Chapter3_1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化
		//判断输入的数是几位数
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number = in.nextInt();
		int count = 0;
		while(number>0)
		{
			number = number/10;
			count = count+1;
		}
		System.out.println("是："+count+"位数");
	}


}
