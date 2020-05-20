package hello;

import java.util.Scanner;

public class Chapter5_2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		System.out.println("请输入3*3的矩阵");
		//读入矩阵
		for (int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		//检查行
		for(int i=0;i<board.length;i++)
		{
			numOfX = 0;
			numOfO = 0; 
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]==1)		
				{
					numOfX ++;
				}
				else
				{
					numOfO ++;
				}					
			}
			if (numOfX == SIZE || numOfO ==SIZE)
			{
				gotResult = true;
				break;
			}
		}
		//检查列
		if(!gotResult)
		{
			for(int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0; 
				for(int j=0;j<board[i].length;j++)
				{
					if(board[j][i]==1)		
					{
						numOfX ++;
					}
					else
					{
						numOfO ++;
					}					
				}
				if (numOfX == SIZE || numOfO ==SIZE)
				{
					gotResult = true;
					break;
			}
		}
		}
		//检查对角线
		if(!gotResult)
		{
			for(int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0; 
				if(board[i][i]==1)		
					{
						numOfX ++;
					}
					else
					{
						numOfO ++;
					}					
				if (numOfX == SIZE || numOfO ==SIZE)
				{
					gotResult = true;
					break;
				}
			}
		}
		//检查反对角线
		if(!gotResult)
		{
			for(int i=0;i<board.length;i++)
			{
				numOfX = 0;
				numOfO = 0; 
				if(board[i][SIZE-i-1]==1)		
					{
						numOfX ++;
					}
					else
					{
						numOfO ++;
					}					
				if (numOfX == SIZE || numOfO ==SIZE)
				{
					gotResult = true;
					break;
				}
			}
		}
		if(gotResult)
		{
			if(numOfX == SIZE)
			{
				System.out.println("1赢了");
			}
			else
			{
				System.out.println("0赢了");
			}
		}
		else
		{
			System.out.println("还没分出胜负");
		}
	}
}
