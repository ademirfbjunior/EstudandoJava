package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class MainEx1 {

	public static void main(String[] args) {
	 //instaciando Locale para linguagem do programa
	 Locale.setDefault(Locale.US);
		
	 //instaciando Scanner para input
	 Scanner sc = new Scanner(System.in);
	
	
	 
	 Rectangle retangle = new Rectangle();
	 
	 System.out.print("Enter rectangle width: ");
	 retangle.height = sc.nextDouble();
	 
	 System.out.print("Enter rectangle height: ");
	 retangle.width = sc.nextDouble();
	 
	 sc.nextLine();
	 
	 System.out.println(String.format("\n"
	 								+ "AREA = %.2f\n"
	 								+ "PERIMETER = %.2f\n"
	 								+ "DIAGONAL = %.2f", retangle.Area(), retangle.Perimeter(), retangle.Diagonal()));
	 
	 
	sc.close();
		

	}

}
