package hello;

import java.util.Scanner;

public class Chatper7_3_1 {
//	public static boolean isPrime(int n)//�ж��Ƿ�������
//	{
//		boolean isPrime = true;
//		for(int i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				isPrime = false;
//				break;
//			}
//		}
//		return isPrime;
//	}
//	public static int notPrime(int n)//���������ķ�����С������
//	{
//		int i = 2;
//		for(i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				break;
//			}
//		}
//		return i;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
////		boolean isPrime = true;
//		int input = in.nextInt();
////		isPrime = isPrime(input);
//		System.out.print(input+"=");
//		
//		if (isPrime(input)) {
//			System.out.print(input);
//		} else {
//			while (!isPrime(input)) {
//				System.out.print(notPrime(input) + "*");
//				input = input / notPrime(input);
//			}
//			System.out.print(input);
//		}
//		
		
		
		
//	}
	
static boolean is_odd(int n)// �Ƿ�Ϊ����
{
	if (n == 2 || n == 3)
		return true;
	if (n % 2 == 0)
		return false;// �����϶�����ż��
	int i;
	for (i = 3; i <= n / 2; i += 2)// ��������������ѡ
		if (n % i == 0)
			return false;
	return true;
}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("������ֵ");
	int n = in.nextInt();
	int i;
	System.out.print(n + "=");
	for (i = 2; i <= n; i++)
	{
		if (!is_odd(i))
			continue;// ���i��������,��i++,������һ��ѭ��
		if (n % i == 0) 
		{
			while (true)// ���n%iһֱ ==0��һֱ�ֽ�,��������,i++
			{
				System.out.print(i);
				n /= i;
				if (n != 1)
					System.out.print("*");
				if (n % i != 0)
					break;
			}
		}
	}
	System.out.println();
}
}
