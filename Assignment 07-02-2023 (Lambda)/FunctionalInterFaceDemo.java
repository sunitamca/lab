package java8features;

@FunctionalInterface
interface message{
	
	void say();
	//void walk();
	
	default void msg()
	{
		System.out.println("Default with method body!");
	}
	
	default void talk()
	{
		System.out.println("Secound default method!");
	}
	//can contain any number of object class method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class FunctionalInterFaceDemo implements message{

	@Override
	public void say() {
		System.out.println("Saying I'm Back!!");
		
	}
	public static void main(String[] args) {
		FunctionalInterFaceDemo demo = new FunctionalInterFaceDemo();
		demo.msg();
		demo.say();
		demo.talk();
	}

}

/*Function Interface- an interface that contains exactly one abstract
 * method is known as functional interface. It can have any number of
 * default, static method but can contain only one abstract method. It
 * can also declare method of object class.
 * 
 * It is also known as Single Abstract Method interface or SAM interface.
 */

