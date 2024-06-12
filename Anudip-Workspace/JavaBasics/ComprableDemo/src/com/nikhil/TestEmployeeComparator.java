package com.nikhil;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(111, "Nikhil", 20000);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(emp1);
		emplist.add(new Employee(106, "Aniket", 30000));
		emplist.add(new Employee(103, "Suraj", 25000));
		emplist.add(new Employee(102, "Aakansha", 28000));
		
		System.out.println("Sorted by ID : ");
		
		EmployeeIDComparator id= new EmployeeIDComparator();
		Collections.sort(emplist, id);
		for (Employee emp : emplist)
            System.out.println( emp.getId() + " "
                               + emp.getName() + " "
                               + emp.getSal());
		
		
		System.out.println("------------------------------------------------");
		System.out.println("Sorted by Salary : ");
		
		EmployeeSalaryComparator sal= new EmployeeSalaryComparator();
		Collections.sort(emplist, sal);
		for (Employee emp : emplist)
            System.out.println( emp.getId() + " "
                               + emp.getName() + " "
                               + emp.getSal());
		
		System.out.println("------------------------------------------------");
		System.out.println("Sorted by Name : ");
		
		EmployeeNameComparator name= new EmployeeNameComparator();
		Collections.sort(emplist, name);
		for (Employee emp : emplist)
            System.out.println( emp.getId() + " "
                               + emp.getName() + " "
                               + emp.getSal());
	}

}
