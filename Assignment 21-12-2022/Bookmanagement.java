package oops;
class Book{
	int bookno ;
	int bookprice;
	String bookname,booktital;
	long bookid;

	
	public void createBook(int bookno, int bookprice, String bookname, String booktital, long bookid)
	{
		this.bookno=bookno;
		this.bookprice=bookprice;
		this.bookname=bookname;
		this.booktital=booktital;
		this.bookid=bookid;
		
		
	}
	public void display()
	{

		System.out.println("bookno: "+bookno);
		System.out.println("bookprice: "+bookprice);
		System.out.println("bookname: "+bookname);
		System.out.println("booktital: "+booktital);
		System.out.println("bookid: "+bookid);
	}
	
		}

public class Bookmanagement {
	public static void main(String[] args) {
		Book  book1 = new Book();
		book1.createBook(1, 500,"Hindi","Antra",56845l);
		book1.display();
		System.out.println();
		
		Book book2 = new Book();
		book2.createBook(2, 700, "English", "Animal", 50001);
		book2.display();
		System.out.println();
		
		Book book3 = new Book();
		book3.createBook(3, 200, "Math", "Triangle",6654);
		book3.display();
		System.out.println();
		
		Book book4 = new Book();
		book4.createBook(4, 600, "Science", "Atomic", 65438);
		book4.display();
		System.out.println();
		
		Book book5 = new Book();
		book5.createBook(5, 800, "S.S.T", "Political", 56423);
		book5.display();
		System.out.println();
	}

}
