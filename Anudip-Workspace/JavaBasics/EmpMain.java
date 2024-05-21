package JavaBasics;

class Employee
{
	private String name ;
	private String role;
	
	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public double calculateSalary() {
		return 0.0;
	}
	
}
class Manager extends Employee{
	private double baseSalary;
	private double bonus;
	
	public Manager( double baseSalary, double bonus) {
		super();
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	public double calculateSalary() {
		return baseSalary + bonus;
	}
	
	
	
}

class Programmer extends Employee{
	private double baseSalary;
	private double overTime;
	
	public Programmer( double baseSalary, double overTime) {
		super();
		this.baseSalary = baseSalary;
		this.overTime = overTime;
	}
	
	public double calculateSalary() {
		return baseSalary + overTime;
	}
	
	
	
}


public class EmpMain {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setName("Nikhil"); // using getter setter we can use private members in other classes also 
		emp.setRole("Admin");
		
		
		Employee emp1= new Manager(56565,21652);
		emp1.calculateSalary();
		Employee emp2= new Programmer(54552.625,2595652.256);
		emp2.calculateSalary();
		
	}

}
