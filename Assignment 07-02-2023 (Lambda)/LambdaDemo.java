package java8features;

interface sayable
{
	//void message();
	//String msg();
	int addition(int a,int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
//		//without using lambda expression
//		sayable s = new sayable() {
//
//			@Override
//			public void message() {
//				System.out.println("Hello Java!!");
//				
//			}
//			
//		};
//		s.message();sss
       
		//using lambda expression
//		sayable s= () -> System.out.println("Hello Java!!");
//		s.message();
		
//		sayable s=() ->{
//			return "We are learning Java 8 feature";
//		};
//		System.out.println(s.msg());
		
		sayable s1 = (a,b)-> (a+b);
		System.out.println("Addition: "+s1.addition(5, 5));
		
		sayable s2 = (int a,int b)->
		{
			return (a+b);
		};
		System.out.println("Addition: "+s2.addition(50, 50));
   }

}
