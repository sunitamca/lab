package arrayprogames;

import java.util.Scanner;

public class DeleteElementSpecificPos {

	public static void main(String[] args) {
		int a[] = new int[20];
		int elements,pos,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter:");
		elements = sc.nextInt();
		
		System.out.println("Enter "+elements+" elements:");
		for(i=0;i<elements;i++)
		{
			a[i]=sc.nextInt();
		}
		//printing the elements before deletion
		System.out.println("Array before deletion:");
		for(i=0;i<elements;i++)
		{
			System.out.print(a[i]+" ");
		}
			System.out.println();
			
			System.out.println("Enter the position from where to delete:");
			pos = sc.nextInt();
			
			//checking if the position is valid or not
			if(pos>elements+1 || pos<0)
			{
				System.out.println("Invalid postion!!");
			}
			else
			{
				//removing the element from the position and also shifting the elements in its position
				for(i=pos-1;i<elements;i++) 
				{
					a[i]= a[i+1];
				}
				//decrementing the size
				elements--;
				
				System.out.println("Array after deletion:");
				for(i=0;i<elements;i++)
				{
		 System.out.println(a[i]+" ");

	}
	System.out.println();

}
	}
	
}
