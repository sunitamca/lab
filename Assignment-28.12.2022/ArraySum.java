//WAP to find the sum of all the elements of an array
package arrayprogames;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating object of scanner
		System.out.println("Enten the size of array:");
		int s = sc.nextInt();//taking the size of array during run time
		int a[] = new int[s];//declaring an array
		int sum=0;
		//taking input
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//finding the sum
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of all the elements in the array: "+sum);
		

	}

}
