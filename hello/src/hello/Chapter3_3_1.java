package hello;

import java.util.Scanner;

public class Chapter3_3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = 0;
		int js = 0;
		int os = 0;
		number = in.nextInt();
		while(number != -1)
		{
			if(number%2==0)
			{
				os++;
			}
			else
			{
				js++;
			}
			number = in.nextInt();
		}
		System.out.println("ÆæÊý£º"+js+",Å¼Êý£º"+os);
	}


}
