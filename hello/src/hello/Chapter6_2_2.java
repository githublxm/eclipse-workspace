package hello;

import java.util.Scanner;

public class Chapter6_2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = "0123456789ºº×Ö";
		System.out.println(s1.charAt(0));
		System.out.println(s1.substring(2,4));//²»°üÀ¨4
		System.out.println(s1.indexOf('ºº'));
		System.out.println(s1.indexOf('A'));
		String a = "abcd";
		a.toUpperCase();
		System.out.println(a);
		a = a.toUpperCase();
		System.out.println(a);
//		for (int i=0;i<s1.length();i++)
//		{
//			System.out.println(s1.charAt(i));
//		}
		
	}

}
