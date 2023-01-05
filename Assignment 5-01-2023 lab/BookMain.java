package bookmanagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookService bService = new BookService();
		int ch;
		
	  do {
		  System.out.println("Welcome to Book Managrement System");
		  System.out.println("1) Create Book Details\n"
				  + "2) Get Book Details Using ID\n"
				  + "3)Get All Book etails\n"
				  + "4)Get  Details By Book name\n"
				  + "5)Exit");
		  System.out.println("=======================");
		  System.out.println("Enter your choice:");
		  ch= sc.nextInt();
		  switch(ch)
		  {
		  case 1:
			  bService.createBook();
		      System.out.println();
		      break;
		  case 2:
			  bService.getBookDetailsUsingID();
			  System.out.println();
			  break;
		  case 3:
		       bService.getAllBookDetails();
		       System.out.println();
		       break;
		  case 4:
			  bService.getBookDetailsUsingBookName();
		       System.out.println();
		       break;
		  case 5:
			  System.out.println("Thank you for visiting!!");
			  System.exit(0);
		 
			  default:
				  System.out.println("Wrong Input!!");
		      
		  }
	  }while(true);

	}

}
