package question2;
class Employee
{
	String FirstName;
	String LastName;
	public Employee(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

	 


}

public class InstanceDemo {
	public static void main(String[] args)
	{
		Employee e1= new Employee("Yashodha","Nesaragi");
		System.out.println(e1);
		Employee e2= new Employee("Apoorva","Joshi");
		System.out.println(e2);
		Employee e3=new Employee("Kavya","Bhat");
		System.out.println(e3);
	}


}
