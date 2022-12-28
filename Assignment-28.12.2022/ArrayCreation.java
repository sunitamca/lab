package arrayprogames;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		
		//creating an array in compile time
		int arr[]= {2,6,5,4,3,};
		
		String name[]= {"Rahul","Sunita","lokesh","Priya"};
		
		char c[]= {'a','b','c'};
		
		System.out.println(name.length);
		System.out.println(arr.length);
		
		//printing the values of an array using for loop
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}

		System.out.println();
		Scanner sc = new Scanner(System.in);
		//creating an array in run time
		int arr1[] = new int[5];//
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= sc.nextInt();
		}
		System.out.println("Printing using for loop:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Printing using for-each loop:");
		for(int var: arr1)
		{
			System.out.println(var);
		}
	}

}
