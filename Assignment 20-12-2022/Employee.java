package oops;
class Employee1{
	int id;
	String
	name,city,country,state,designation;
	final int aadhar;
	long phone,salary;
	
	public Employee1(int id,String name, String city, int aadhar)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.aadhar=aadhar;
		
	}
	
	public Employee1(int id, String name, String city, int aadhar, String country, String state)
	{
		this(id,name,city,aadhar);
		this.country= country;
		this.state=state;
		
	}
	
	public Employee1(int id,String name,String city,int aadhar, String country,String state,long salary, long phone,String designation)
	{
		this(id,name,city,aadhar,country,state);
		
		this.phone=phone;
		this.salary=salary;
		this.designation=designation;
	}
	
 @Override
 public String toString() {
	 return "Employee[id=" +id+",name=" +name+",city=" +city+",country=" +country+",state=" +state+", designation=" +designation+",aadhar=" +aadhar +" ,phone="+phone+",salary="+salary+"]";
 
 }
 
 public void display()
 {
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
	System.out.println("City: "+city);
	System.out.println("Aadhar No: "+aadhar);
	System.out.println("State: "+state);
	System.out.println("Country: "+country);
	
 }
}


public class Employee {

	public static void main(String[] args) 
	{
		Employee1 employee1 = new
				Employee1(1,"shawin","Darjeeling",123456789);
		//employee1.display();
		System.out.println(employee1);
		System.out.println();
		
		Employee1 employee2 = new
				Employee1(2,"Niraj","Bokaro",15682223);
		//employee2.display();
		System.out.println(employee1);
		System.out.println();
		
		Employee1 employee3 = new
				Employee1(3,"Dhiraj","Ranchi",987654321);
		//employee3.display();
		System.out.println(employee1);
		System.out.println();
		

	}

}
