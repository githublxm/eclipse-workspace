package hello;

import java.util.Scanner;

public class Chapter3_1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ��
		//�ж���������Ǽ�λ��
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������");
		int number = in.nextInt();
		int count = 0;
		while(number>0)
		{
			number = number/10;
			count = count+1;
		}
		System.out.println("�ǣ�"+count+"λ��");
	}


}