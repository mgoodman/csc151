

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("Bob the Builder", 50000);
		
		System.out.println(e.getSalary());
		
		e.raiseSalary(.50);
		System.out.println(e.getSalary());
		
		System.out.println(e.getName() + " got a raise!");
	}
	
}
