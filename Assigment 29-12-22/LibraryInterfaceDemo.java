package arrayprogames;

interface LibraryUser{
	void registerAccount();
	void requestBook();
}

class Kiduser implements LibraryUser{
int age;
String bookType;

		
	
	public Kiduser(int age, String bookType) {
	super();
	this.age = age;
	this.bookType = bookType;
}

	@Override
	public void registerAccount() {
		if (age<=12) {
			System.out.println("you have successfully register under a kid account");
		}
		else
		{
			System.out.println("Sorry, age must be less than 12 to register as a kid ");
		}
		
	}

	@Override
	public void requestBook() {
		if (bookType.equalsIgnoreCase("kids")) {
			System.out.println("book issued succussfully please return the book within 10 days");
		}
		else
		{
			System.out.println("oops, you are allowed to take kid books only");
		}
		
	}
	
}
class Adultuser implements LibraryUser{

	int age;
	String bookType;
	
	public Adultuser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age<=12) {
			System.out.println("You have successfully registered under An Adult Account ");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook() {
		if (bookType.equalsIgnoreCase("Adult")) {
			System.out.println("Book issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops,you are allowed to take only adult fiction books");
		}
		
	}
	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
     Kiduser k = new Kiduser(10,"Kids");
     k.registerAccount();
     k.requestBook();
     System.out.println();
     
     Kiduser k1 = new Kiduser(18,"ficton");
     k1.registerAccount();
     k1.requestBook();
     System.out.println();
     
     Adultuser a = new Adultuser(5,"Kids");
     a.registerAccount();
     a.requestBook();
     System.out.println();
     
     Adultuser a2 = new Adultuser(23,"fiction");
     a2.registerAccount();
     a2.requestBook();
     	}

}


