package hello;

import java.util.Scanner;

public class Chapter3_1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
		while(true)
		{
			System.out.println("��Ͷ�ң�");
			int amount = in.nextInt();
			balance = balance + amount;
			if(balance>=10)
			{
				System.out.println("**************");
				System.out.println("*java�Ǽ���·ר��*");
				System.out.println("*��ָ����λƱ*");
				System.out.println("*Ʊ�ۣ�10Ԫ*");
				System.out.println("**************");
				//���㲢��������
				System.out.println("���㣺"+(balance-10));
				balance = 0;
			}
		}
	}

}
