package oops;

//parent/super/base class
class User{
	int id;
	String name,address;
	
	public void setData(int id, String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}

//sub/child/derived class
class Teacher extends User{
	double salary;
	String subject;


public void setData(int id, String name, String address, double salary, String subject)
{
	super.setData(id, name, address);//parent class setData usin super
	this.salary=salary;
	this.subject=subject;
}

public void display()
{
	super.display();//calling parent class display()using super
	System.out.println("Salary: "+salary);
	System.out.println("Subject: "+subject);
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.setData(1, "sunita", "Bokaro", 10000, "java");
		teacher1.display();
		

	}

}
