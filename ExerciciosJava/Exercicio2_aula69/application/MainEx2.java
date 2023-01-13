package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class MainEx2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employeee:" + emp.toString());
		System.out.println();
		
		System.out.print("Wich percentage to increase salary? ");
		//double percentage = sc.nextDouble();
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println();
		
		
		System.out.println("Update data:" + emp.toString());
		
		
	}

}
