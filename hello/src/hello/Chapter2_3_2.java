package hello;

import java.util.Scanner;

public class Chapter2_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int signal = 0;
		int r = 0;
		int s = 0;
		System.out.println("�������ź����֣�");
		signal = in.nextInt();
		r = signal/10;
		s = signal%10;
		switch(s)
		{
		case 1:
			System.out.println("�źſɱ�ʶ����1��");
			break;
		case 2:
			System.out.println("�źſɱ�ʶ����2��");
			break;
		case 3:
			System.out.println("�źſɱ�ʶ����3��");
			break;
		case 4:
			System.out.println("�źſɱ�ʶ����4��");
			break;
		case 5:
			System.out.println("�źſɱ�ʶ����5��");
			break;
		case 6:
			System.out.println("�źſɱ�ʶ����6��");
			break;
		case 7:
			System.out.println("�źſɱ�ʶ����7��");
			break;
		case 8:
			System.out.println("�źſɱ�ʶ����8��");
			break;
		default :
			System.out.println("�źſɱ�ʶ����9��");
			break;
		}
		switch(r)
		{
		case 1:
			System.out.println("�ź�ǿ����1");
			break;
		case 2:
			System.out.println("�ź�ǿ����2");
			break;
		case 3:
			System.out.println("�ź�ǿ����3");
			break;
		case 4:
			System.out.println("�ź�ǿ����4");
			break;
		default :
			System.out.println("�ź�ǿ����5");
			break;
		}
		
		
		
	}


}
