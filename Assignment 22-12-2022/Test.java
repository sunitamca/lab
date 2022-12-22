package oops;

public class Test {

	public static void main(String[] args)
	{
		StudentNew student1 = new StudentNew();
		student1.setId(1);
		student1.setFirstName("shawin");
		student1.setLastName("Pradhan");
		student1.setAddress("Darjeeling");
		
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getAddress());
		
		System.out.println();
		
		StudentNew student2 = new StudentNew();
		student2.setId(2);
		student2.setFirstName("Monika");
		student2.setLastName("kumari");
		student2.setAddress("hurdag");
		
		System.out.println(student2.getId());
		System.out.println(student2.getFirstName());
		System.out.println(student2.getLastName());
		System.out.println(student2.getAddress());
		
		
		
	}
}
