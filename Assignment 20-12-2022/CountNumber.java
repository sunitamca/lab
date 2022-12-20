package basic;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num,temp,i;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		temp=num;
		System.out.println("Using for loop");
		for(i=0;num!=0;i++)
		{
			num = num/10;
		}
		System.out.println("No.of digits in "+temp+"is :"+i);
		System.out.println();
		System.out.print("Using while loop");
		int count=0;
		while(num!=0)
		{
			
		}

	}

}
