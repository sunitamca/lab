package abstractiondemo;

interface Printable{//first interface
	int x=100;
	//we cannot dd the body of the method so we need to implement it
	void display();
	void fun();
}
//interface --> interface (extenda)
//class --> class (extends)
//class --> interface(implements)

interface Drawable extends Printable{//second interface inheriting printable
	void draw();
	
}
//third interface without using extends it interits both printable and Drawable
interface Sayable{
	void say();
	int x=10;
}
class Print implements Drawable
{

	@Override
	public void display() {
		System.out.println("HELLO");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun");
		
		
	}
	
}
//using interface we can perform multiple interitance (though not supported in java)
class Message implements Drawable,Sayable{
//we can solve the diamond problem using interface
//a class inherit any number of interfaces
	
	@Override
	public void display() {
		System.out.println("HELLO");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun.");
		
	}

	@Override
	public void say() {
		System.out.println("Speaking is fun.");
		
	}

	@Override
	public void draw() {
		System.out.print("Drawing is fun.");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//you cannot instantion interface, but we can create reference variable
		Print print = new Print();
		print.display();
		print.draw();
		print.fun();
		System.out.println("The value of x is: "+Print.x);
		
		System.out.println();
		Message message = new Message();
		message.display();
		message.draw();
		message.fun();
		message.say();
		System.out.println("The value of x is: "+Sayable.x);
		//printing the value of x using reference variable
	}

}
