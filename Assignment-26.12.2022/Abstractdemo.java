package abstractiondemo;

//we cannot create instance/object but we can create reference variable
abstract class Bank{
	//abstract method - method does not have body
	//must be declare abstract keyword and followed by semi colon
	abstract public void getLoanInterest();
	
	//concrete method - method has a body
	public void display()
	{
		System.out.println("This is a bank class..");
	}
}

class Sbi extends Bank{

	@Override
	public void getLoanInterest() {//abstract method called and implemented
		
		System.out.println("SBI is providing 6.5% interest");
	
		
	}
	
}

class Hdfc extends Bank{

	@Override
	public void getLoanInterest() {
		
		System.out.println("HDFC is providing 7.5% interest");
		
		
	}
	
}

public class Abstractdemo {

	public static void main(String[] args) {
		{
			Bank bank;//reference variable	
			bank = new Sbi();
			bank.getLoanInterest();
			bank.display();
			
			
			Hdfc hdfc = new Hdfc();
			hdfc.getLoanInterest();
			hdfc.display();//concrete method
		}

	}

}
