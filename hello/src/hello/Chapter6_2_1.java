package hello;

import java.util.Scanner;

public class Chapter6_2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = new String("Hello");
		System.out.println(s+" world"+12);
//		String ss ;	
//		ss = in.next();//输入bye
//		System.out.println(ss=="bye");//
//		System.out.println(ss.equals("bye"));
		String b = "hi";
		b = "nihao";//“hi”并没有被改变，只是把b重新指向了另一个字符串“nihao”
		System.out.println(b);
	}

}
