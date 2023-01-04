//WAP to count duplicate elements in an array
package arrayprogames;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0,i,size;
		System.out.println("Enter the size: ");//declaring size of array
		size = sc.nextInt();
		int a1[] = new int[size];
		System.out.println("Enter the elements:");//taking elements in array
		for(i=0;i<size;i++)
		{
			a1[i] = sc.nextInt();
		}
		
		//printing the elenments
		for(i=0;i<size;i++)
		{
			System.out.print(a1[i]+ " ");
		}
		System.out.println();
		
		System.out.println();
		//finding duplicate items in an array
		System.out.println("Duplicate items:");
		for (i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if (a1[i]==a1[j])
				{
					System.out.print(a1[i]+" ");
					count++;
					break;
				}
			}
		}
		System.out.println();
		 System.out.println("The no. of duplicate items: "+count);

	}

}
