package abstractiondemo;
//another way of performing multiple inheritance
abstract class E //declaring an abstract class
{
	abstract void display();//abstract method
	
	public void demo()//concrete method
	{
		System.out.println("Abstract class");
	}
}
interface F //declaring an interface
{
	void add(int a,int b);
	}
class G extends E implements F
{
	@Override
	public void add(int a, int b) {
	System.out.println("Sum: "+(a+b));
		
	}

	@Override
	void display() {
		System.out.println("Multiple inheritance achieved!!");		
	}

} class MultipleInheritance2 {

	public static void main(String[] args) {
	   G g = new G();
	   g.add(10, 20);
	   g.display();
	   g.demo();
	}

}
