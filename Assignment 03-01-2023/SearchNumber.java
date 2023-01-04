package arrayprogames;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		int size,i;
		Scanner sc = new Scanner(System.in);
		//initializing the pos as -1 as the 1st element on an array is stored as index 0
		//int pos=-1;
		boolean flag = false;//usin boolean variable flag and initializing it as false
		System.out.println("Enter size of array:");
		size = sc.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter "+size+" elements: ");
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter whic element you want to search:");
		int search= sc.nextInt();
				
				//searching for the element
				for(i=0;i<size;i++)
				{
					if(ar[i]==search)//checking the search with index elements
					{
						flag = true;//if element is found setting flag to be true
						
						//pos =i; //storing the position of intex in pos
						break;//ifX we find the number we break the loop
					
					
					}
				}
		
		//if(pos!=-1)
		if(flag==true)
		{
			//System.out.println("The element "+search+" is present in: "+(i+1)+" position");
			System.out.println("The element "+search+" is present in: "+(i+1));
			
			}
		else
		{
			System.out.println("Data not found in array!!");
		}

	}

}
