package hello;

import java.util.Scanner;

public class Chapter4_1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = in.nextInt();
//		int i = 1;
		int factor = 1;
		for(int i=1;i<=n;i++)
		{
//			factor = factor*i;
			factor*=i;
		}
		System.out.println(factor);
	}

}
