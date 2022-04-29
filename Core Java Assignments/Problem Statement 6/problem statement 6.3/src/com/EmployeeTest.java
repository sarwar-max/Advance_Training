package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		
		System.out.println("Id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		
		Employee emp1 = new Employee(101, "Ramesh");
		System.out.println("Id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		
		Employee emp2 = new Employee(102, "Ajay");
		System.out.println(emp2);
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp);
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(new Employee(103, "Balaji"));
		System.out.println("Number of employees "+listOfEmp.size());
		listOfEmp.remove(1);		// using index position 
		System.out.println("Number of employees "+listOfEmp.size());
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
//			if(e.getId()==1000) {
//				System.out.println(emp.getName());
//			}
			System.out.println(e);
		}
	}
}
