package basics;

public class Employee {
	
	// state -- member varibles
	int id; 
	String name;
	double salary;

	// behavior -- methods
	public String getInfo() {
		return "Id: " + this.id + "Name: " + this.name + "salary: " + this.salary;
	}
	public void incrementSalary(int amount) {
		this.salary = this.salary + amount;
	}
	
	public static void main(String[] args) {
		// objects
		Employee employee = new Employee();
		employee.id = 456767;
		employee.name = "Priya";
		employee.salary = 10000;
		System.out.println(employee.getInfo());
		
		employee.incrementSalary(5000);
		System.out.println(employee.getInfo());
		
		
		Employee employee2 = new Employee();
		employee2.id = 4334;
		employee2.name = "Harshit";
		employee2.salary = 12000;
		System.out.println(employee2.getInfo());
		
	}

}
