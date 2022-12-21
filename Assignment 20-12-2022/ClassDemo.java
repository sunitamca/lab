package basic;
class Student{
	int id;
	String name,address;
	long phone;
	
	/*public void setData(int i, String n, String add, long ph)
	  {
		id=i;
		name=n;
		address=add;
		phone=ph;
	  }*/
	
	 public void setData(int id, String name, String address, long phone)
			 {
		           this.id=id;
		           this.name=name;
		           this.address=address;
		           this.phone=phone;
			 }
	      public void getData()
	      {
	    	  System.out.println("ID: "+id);
	    	  System.out.println("Name: "+name);
	    	  System.out.println("Address: "+address);
	    	  System.out.println("Mobile No: "+phone);
	    	  
	      }
}

public class ClassDemo {

	public static void main(String[] args) {
		//create object / class instantiation
		Student student = new Student();
		//using instance of a class(not safe)
		/*student.id=101;
		student.name="Sunita";
		student.address="tulbul bokaro";
		student.phone=8809721500;
		System.out.println(student.address);*/
		student.setData(101, "Suraj", "Ranch", 7250775897l);
		student.getData();
		

	}

}
