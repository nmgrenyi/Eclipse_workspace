import java.util.Scanner;

public class two_dimention_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int [][] board = new int [SIZE][SIZE];
		boolean gotResult = false;
		int num0fx = 0;
		int num0f0 = 0;
		
		for (int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = in.nextInt();
				
			}
		}
		// check line
		for (int i=0;i<board.length;i++)
		{
			boolean isEqual = true;
			for(int j=1;j<board[i].length;j++)
			{
				if (board[i][j] != board[i][j-1])
				{
					isEqual = false;
					break;
				}
			}
			if(isEqual == true)
			{
				System.out.println("elements in line "+ (i+1) +" are same!");
			}
		}
		//check column
		for (int j=0;j<board.length;j++)
		{
			boolean isEqual = true;
			for(int i=1;i<board.length;i++)
			{
				if (board[i][j] != board[i-1][j])
				{
					isEqual = false;
					break;
				}
			}
			if(isEqual == true)
			{
				System.out.println("elements in column "+ (j+1) +" are same!");
			}
		}
		//check diagonal
		for (int i=1;i<board.length;i++)
		{
			boolean isEqual = true;
			for(int j=1;j<board[i].length;j++)
			{
				if (board[i][j] != board[i-1][j-1])
				{
					isEqual = false;
					break;
				}
			}
			if(isEqual == true)
			{
				System.out.println("elements in diagonal are same!");
			}
		}
		//check back diagonal
//		for (int i=0;i<board.length;i++)
//		{
			boolean isEqual = true;
			for(int i=0, j=(board.length -1);i<(board.length-1) & j>0;i++,j--)
			{
//				System.out.println("board.length - 1"+ (board.length - 1));
				if (board[i][j] != board[i+1][j-1])
				{
					isEqual = false;
					break;
				}
			}
			if(isEqual == true)
			{
				System.out.println("elements in back diaganol are same!");
			}
//		}
		
		}

}
