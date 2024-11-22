package student.oops.array;

public class Employee {
int id;
String name;
int salary;
public Employee(int id, String name, int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public void details()
{
	System.out.println("Employee is"+id);
	//System.out.println("Employee salary is"+salary);
	
	System.out.println("Employee name is"+name);
	System.out.println("Employee salary is"+salary);
}
public static void main(String[] args) {
	Employee e1=new Employee(101, "RAM",40000);
	Employee e2=new Employee(102,"SAM",50000);
	Employee e3=new Employee(103, "TINA",60000);
	Employee e[]= {e1,e2,e3};
	for( Employee i:e)
	{
		if(i.salary>30000)
		i.details();
	}
	
}
}
