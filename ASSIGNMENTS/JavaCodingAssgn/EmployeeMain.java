package JavaCodingAssgn;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1= new Employee(1,"Roshika","Chennai");
		Employee emp2= new Employee(2,"Dhanyaka","Bangalore");
		Employee emp3= new Employee(3,"Kiran Kumar","Hyderabad");
		Employee emp4= new Employee(4,"Suneetha","Pune");
		Employee emp5= new Employee(5,"Roxy","New Delhi");
		
		AddEmployee add = new AddEmployee();
		add.addEmployee(emp1);
		add.addEmployee(emp2);
		add.addEmployee(emp3);
		add.addEmployee(emp4);
		add.addEmployee(emp5);
		
		for (Employee e: add.list)
		{
			System.out.println(e);
		}
		System.out.println("\n***********************************************************\n");
		System.out.println(add.getEmployee(4));
	}
}