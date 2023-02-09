package Lab;

import java.util.Scanner;

public class SearchNumber1 {

	public static void main(String[] args) {
		int size,i;
		Scanner Sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter size of array:");
		size = Sc.nextInt();
		int ar[]= new int [size];
		System.out.println("Enter"+size+"elements:");
		for(i=0;i<size;i++)
		{
			ar[i]=Sc.nextInt();
		}
		System.out.println("Enter which element you want to Search:");
		int search = Sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(ar[i]==search)
			{
				flag=true;
				break;
			}
		}
		

	}

}
