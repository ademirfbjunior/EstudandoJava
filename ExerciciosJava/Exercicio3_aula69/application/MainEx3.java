package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class MainEx3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		
			
		System.out.print("Name:");
		student.name = sc.nextLine();
			
	
		while (true) {
			System.out.print("Grade semester 1: ");
			double semValue = sc.nextDouble();
			if(semValue >=0 && semValue<=student.getNotaMaxSem1()) {
				student.notaSem1 = semValue;
				break;
			}else {
				
				System.out.print("Value Invalid, Tray Again !\n");
				
			}		
		}
		
		while (true) {
			System.out.print("Grade semester 2: ");
			double semValue = sc.nextDouble();
			if(semValue >=0 && semValue<=student.getNotaMaxSem2()) {
				student.notaSem2 = semValue;
				break;
			}else {
				
				System.out.println("Value Invalid, Tray Again !\n");
				
			}
		}
		
		while (true) {
			System.out.print("Grade semester 3: ");
			double semValue = sc.nextDouble();
			if(semValue >=0 && semValue<=student.getNotaMaxSem3()) {
				student.notaSem3 = semValue;
				break;
			}else {
				
				System.out.println("Value Invalid, Tray Again !\n");
				
			}
		}
				
		
		
		
		System.out.println(student.toString());
		
		if(student.FinalGrade() < student.getMedia()) {
			
			System.out.println(String.format("FAILED \nMissing %.2f Points", student.MissingPoints() ));
		
			
		}else {
			
			
			System.out.println("PASS");
			
		}

	}

}
