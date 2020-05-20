package hello;

import java.util.Scanner;

public class Chapter2_3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int utc = 0;
		int bjt = 0;
		System.out.println("请输入北京时间");
		bjt = in.nextInt();
		int time = 0;
		int second = 0;
//		if(bjt>59)
//		{
//			
		time = bjt / 100 - 8;
		if (time < 0) {
			time = time + 24;
		}
		second = bjt % 100;
//		}
//		else
//		{
//			second = bjt;
//		}
		utc = time*100+second;
		System.out.println(utc);
//		int limit = 100;
//		int num1 = 15;
//		int num2 = 40;
//		if ( limit <= limit)
//		{
//		    if ( num1 == num2 )
//		        System.out.println("lemon");
//		    System.out.println("lime");
//		}
//		System.out.println("grape");

	}

}
