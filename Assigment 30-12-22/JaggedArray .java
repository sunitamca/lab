package arrayprogames;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		arr[0] = new int[3]; //1st row and 3 columns
		arr[1] = new int[4]; //2nd row and 4 columns
		arr[2] = new int[2]; //3rd row and 2 columns
		
		//initializing the jagged array
		int count=1;
		System.out.println("Enter the elements of jagged array:");
		for(int i=0;i<arr.length;i++)//row
		{
			for(int j=0;j<arr[i].length;j++)//column
			{
				arr[i][j]=sc.nextInt();
				//arr[i][j]=count++;				}
		}

	}
		
		//printing jagged arry
		System.out.println("jagged Array");
		for(int i=0;i<arr.length;i++)//row
		{
			for(int j=0;j<arr[i].length;j++)//coloumn
		
		{
			System.out.print(arr[i][j]+"  ");
		}
         System.out.println();//new line
}
}
}

