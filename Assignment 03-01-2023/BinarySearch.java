package arrayprogames;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Enter elements to search:");
		int ele= sc.nextInt();
		int result = Arrays.binarySearch(arr, ele);
		if(result>0)
		{
			System.out.println("Element present in position:"+(result+1));
		}
		else
		{
			System.out.println("Data not found");
		}
		
//  int arr[]={5,6,7,1,9,13};
//int ele = 13;
//int result = Arrays.binarySearch(arr, ele);
//System.out.print("Element found at position : "+(result+1));		

	}

}
