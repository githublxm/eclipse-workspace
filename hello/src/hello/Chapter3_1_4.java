package hello;

import java.util.Scanner;

public class Chapter3_1_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������");
		int number = in.nextInt();
		int count = 0;
		do
		{
			number = number/10;
			count = count+1;
		}while(number>0);
		System.out.println("�ǣ�"+count+"λ��");
		
	}

}
