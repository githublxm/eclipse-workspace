package hello;

import java.util.Scanner;

public class Chapter2_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int signal = 0;
		int r = 0;
		int s = 0;
		System.out.println("请输入信号数字：");
		signal = in.nextInt();
		r = signal/10;
		s = signal%10;
		switch(s)
		{
		case 1:
			System.out.println("信号可辨识度是1，");
			break;
		case 2:
			System.out.println("信号可辨识度是2，");
			break;
		case 3:
			System.out.println("信号可辨识度是3，");
			break;
		case 4:
			System.out.println("信号可辨识度是4，");
			break;
		case 5:
			System.out.println("信号可辨识度是5，");
			break;
		case 6:
			System.out.println("信号可辨识度是6，");
			break;
		case 7:
			System.out.println("信号可辨识度是7，");
			break;
		case 8:
			System.out.println("信号可辨识度是8，");
			break;
		default :
			System.out.println("信号可辨识度是9，");
			break;
		}
		switch(r)
		{
		case 1:
			System.out.println("信号强度是1");
			break;
		case 2:
			System.out.println("信号强度是2");
			break;
		case 3:
			System.out.println("信号强度是3");
			break;
		case 4:
			System.out.println("信号强度是4");
			break;
		default :
			System.out.println("信号强度是5");
			break;
		}
		
		
		
	}


}
