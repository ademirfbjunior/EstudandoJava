package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarPrice = input.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double DolarQuantity = input.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f",CurrencyConverter.dollarToReal(DolarQuantity, dolarPrice));
		
		
		
		input.close();
	}

}
