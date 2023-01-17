package collection;

public class Employee {
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	 
        public void display()
        {
        	System.out.println("Emp ID: "+getEmpId());
        	System.out.println("Emp Name: "+getEmpName());
        }
}
