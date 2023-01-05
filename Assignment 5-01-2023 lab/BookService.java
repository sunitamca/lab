package bookmanagement;

import java.util.Scanner;

public class BookService {
	
	static Book book[] = new Book[10];
    static Scanner sc = new Scanner(System.in);
    static int index=0;
    
    //create book method
    public static void createBook()
    {
    	System.out.println("Enter Book ID");
    	int id = sc.nextInt();
    	
    	sc.nextLine();// it will consume the next line
    	System.out.println("Enter Book Name:");
    	String bname= sc.nextLine();
    	
    	//sc.nextLine();
    	System.out.println("Enter Author's Name:");
    	String author=sc.nextLine();
    	
    	System.out.println("Enter Book Price:");
    	double price=sc.nextDouble();
    	
    	book[index] = new Book(id, bname, author, price);
    	index++;
    	System.out.println("Book details added!!");
    	
    }
    
    //get all book details
    public static void getAllBookDetails()
    {
    	for(int i=0;i<index;i++)
    	{
    		System.out.println("Book ID: "+book[i].getBookId());
    		System.out.println("Book Name: "+book[i].getBookName());
    		System.out.println("Book Author Name: "+book[i].getAuthor());
    		System.out.println("Book Price: "+book[i].getBookPrice());
    		System.out.println("=================================");
    		
    		
    	}
    	
    }
    
    //get book details using id
    public static void getBookDetailsUsingID()
    {
    	boolean flag=false;
    	System.out.println("Enter Book ID to search:");
    	int id = sc.nextInt();
    	for(int i=0;i<index;i++)
    	{
    		if(id==book[i].getBookId())
    		{
    			System.out.println("Book ID: "+book[i].getBookId());
        		System.out.println("Book Name: "+book[i].getBookName());
        		System.out.println("Book Author Name: "+book[i].getAuthor());
        		System.out.println("Book Price: "+book[i].getBookPrice());
        		System.out.println("=================================");
        		flag=true;
        		break;
    		}
    	}
    	
    	if(flag==false)
    	{
    		System.out.println("Book Not Found!!");
    	}
   
	 
    }
    
  //get book details using bookdetails
    public static void getBookDetailsUsingBookName()
    {
    	boolean flag=false;
    	sc.nextLine();
    	System.out.println("Enter Details book Name:");
    	String name = sc.nextLine();
    	for(int i=0;i<index;i++)
    	{
    		if(name.equalsIgnoreCase (book[i].getBookName()))
    		{
    			System.out.println("Book ID: "+book[i].getBookId());
        		System.out.println("Book Name: "+book[i].getBookName());
        		System.out.println("Book Author Name: "+book[i].getAuthor());
        		System.out.println("Book Price: "+book[i].getBookPrice());
        		System.out.println("=================================");
        		flag=true;
        		break;
    		}
    	}
    	if (flag==false)
    	{
    		System.out.println("Invalid book Name");
    	}
    	

}
}

