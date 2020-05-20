package hello;

import java.util.Scanner;

public class Chapter6_3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		char[] s = new char[str.length()];
//		for(int i=0;i<str.length();i++)
//		{
//			while(str[i]!=' ')
//			{
//				count ++;
//			}
//		}
//		Scanner in = new Scanner(System.in);
//		  String a = in.nextLine();
//		  int A=0,B=0;
//		  for(;A<a.length();A++)
//		  {
//		   if(a.charAt(A)==' '||a.charAt(A)=='.')
//		   {
//		    System.out.print(A-B+" ");
//		    B=A+1;
//		   }
//		  }
		// TODO Auto-generated method stub
		        
		Scanner in = new Scanner(System.in);

		String shuru = new String("");

		shuru = in.nextLine();
		in.close();

		String eachShuru[] = shuru.split(" ");

		for (int i = 0; i < eachShuru.length; i++) {
			if (i < eachShuru.length - 1) {
				System.out.print(eachShuru[i].length() + " ");
			} else {
				System.out.print(eachShuru[i].length() - 1);
			}
		}
	}

}
