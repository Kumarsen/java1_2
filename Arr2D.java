package hey;
import java.util.*;
public class Arr2D 
{
	static Scanner sc = new Scanner(System.in);
	static int r,c;
	public static void main(String[] args)
	{
		System.out.println("enter the row size of the matrix");
		r = sc.nextInt();
		System.out.println("enter the column size of the matrix");
		c = sc.nextInt();
		int[][] arr = new int[r][c];
		input(arr);
		display(arr);
	}
	static void input(int[][] arr)
	{
		System.out.println("pls enter values for the matrix :");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}
	static void display(int[][] arr)
	{
		System.out.println("the matrix is :");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
