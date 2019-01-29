package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program_Lista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many Employees will be registred? ");
		int n = sc.nextInt();
		List<Employee> funcionarios = new ArrayList<>();

		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Employee #"+ i + ":");
			System.out.print("ID :");
			int id =sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			funcionarios.add(new Employee(id,name, salary));
			
		}
		
		
		System.out.println("Enter the id employee tha will have salary invrease: ");
		int id = sc.nextInt();
		
		Employee emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			
			System.out.println("This id does not exist!");
			
		}
		
		else {
			
			emp.IncreaseSalary(sc.nextDouble());
			
		}
		
		System.out.println("List of employees: ");
		
		for (Employee obj : funcionarios) {
			 System.out.println(obj);
		}	
		
		
		sc.close();

	}

}
