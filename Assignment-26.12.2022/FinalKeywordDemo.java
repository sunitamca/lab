package abstractiondemo;
class Vehicle
{
	final void speed()//any method declared as final cannot be changed or updated/overried
	{
		System.out.println("The speed is: 100km/hr");
	}
}

public class FinalKeywordDemo extends Vehicle{
	
	final int a=100;// if we declare any variable as final
	//we cannot change the value or even assign a new value to it
	

	public static void main(String[] args) {
		FinalKeywordDemo demo = new FinalKeywordDemo();
		System.out.println(demo.a);
		demo.speed();//printing the final method
		

	}

}
