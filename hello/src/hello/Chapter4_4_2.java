package hello;

import java.util.Scanner;

public class Chapter4_4_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		in = new Scanner(System.in);
		int input = in.nextInt();
		int sign;
		int _input;
		int count = 0;
		
		//�ж�����������Ƿ���ȡֵ��Χ��
		while(input > 100000||input < -100000)
		{
			System.out.println("Illegal input, please input again.");
			input = in.nextInt();
		}
		//���Ϊ����������� fu
		if(input < 0)
		{
			System.out.print("fu ");
		}
		_input = input;
		//�������ֵ�λ��
		while(_input != 0)
		{
			
			_input = _input/10;
			count ++;
		}
		//����ַ�
		while(count > 0)
		{
			int js = (int)Math.pow(10, count-1);//ȡ���ֵĵ�һλ
			sign = (int) (input /js);
			input = input % js;
			switch(Math.abs(sign))
			{
			case 0:System.out.print("ling ");break;
			case 1:System.out.print("yi ");break;
			case 2:System.out.print("er ");break;
			case 3:System.out.print("san ");break;
			case 4:System.out.print("si ");break;
			case 5:System.out.print("wu ");break;
			case 6:System.out.print("liu ");break;
			case 7:System.out.print("qi");break;
			case 8:System.out.print("ba");break;
			case 9:System.out.print("jiu");break;
			default:break;
			}
			count --;
		}
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] num = new int[8];
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		int count;
//		int y;
//		if (number == 0) {
//			System.out.print("ling");
//		} else {
//			if (number >= -100000 && number <= 100000) {
//				if (number < 0) {
//					number = -number;
//					System.out.print("fu" + " ");
//				}
//
//				for (count = 0; number != 0; count++)// ��������ѭ�����������
//				{
//					y = number % 10;
//					// System.out.print(y+" ");
//					num[count] = y;
//					number = number / 10;
//					// System.out.println(count);
//					// System.out.println(num[count]);
//				}
//				// System.out.println(count);
//				for (; count != 0; count--) {
//					int digit = num[count - 1];// ѭ����������еĸ�����
//					switch (digit) {
//					case 0:
//						System.out.print("ling");
//						break;
//					case 1:
//						System.out.print("yi");
//						break;
//					case 2:
//						System.out.print("er");
//						break;
//					case 3:
//						System.out.print("san");
//						break;
//					case 4:
//						System.out.print("si");
//						break;
//					case 5:
//						System.out.print("wu");
//						break;
//					case 6:
//						System.out.print("liu");
//						break;
//					case 7:
//						System.out.print("qi");
//						break;
//					case 8:
//						System.out.print("ba");
//						break;
//					case 9:
//						System.out.print("jiu");
//						break;
//					}
//					if (count != 1) // ���Ǳ�֤ƴ������пո񣬶����һλƴ��֮��û�м��
//					{
//						System.out.print(" ");
////		                System.out.print(count);
//					}
//				}
//			}
//		}
//
//	}

}
