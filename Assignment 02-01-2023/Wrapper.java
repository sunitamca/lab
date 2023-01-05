package arrayprogames;

public class Wrapper {
	
	public static void check(int a)
	{
		System.out.println(a+" is an integer.");
	}
	public static void check(char c)
	{
		System.out.println(c+" is a character.");
	}

	public static void main(String[] args) {
		//auto.boxing-> conversion of primitive data typers into its
		//corresponding wrapper class
		
		int a=20;
		Integer b = Integer.valueOf(a);//converting int into Interger manually
		Integer c = a;//automatic
		System.out.println(a+" "+b+" "+c);
		
		//un-boxing-> conversion of objects into primitive data type
		Integer x = 7;
		int y = x.intValue();//manually
		int z=x;//automatic
		System.out.println(y+" "+z);
		System.out.println(x.getClass().getName());
		Wrapper.check(z);
		

	}

}
