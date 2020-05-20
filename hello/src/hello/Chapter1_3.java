package hello;

import java.util.Scanner;

public class Chapter1_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		int f = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("ÇëÊäÈë»ªÊÏÎÂ¶È");
		f = in.nextInt();
		c = (int)((f-32)/9.0*5);
		System.out.println(c);

	}

}
