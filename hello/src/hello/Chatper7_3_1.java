package hello;

import java.util.Scanner;

public class Chatper7_3_1 {
//	public static boolean isPrime(int n)//判断是否是素数
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
//	public static int notPrime(int n)//不是素数的返回最小整除数
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
	
static boolean is_odd(int n)// 是否为素数
{
	if (n == 2 || n == 3)
		return true;
	if (n % 2 == 0)
		return false;// 素数肯定不是偶数
	int i;
	for (i = 3; i <= n / 2; i += 2)// 素数从奇数中挑选
		if (n % i == 0)
			return false;
	return true;
}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("输入数值");
	int n = in.nextInt();
	int i;
	System.out.print(n + "=");
	for (i = 2; i <= n; i++)
	{
		if (!is_odd(i))
			continue;// 如果i不是素数,则i++,进行下一次循环
		if (n % i == 0) 
		{
			while (true)// 如果n%i一直 ==0则一直分解,否则跳出,i++
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
