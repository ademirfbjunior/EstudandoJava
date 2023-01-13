package util;

public class CurrencyConverter {

 public static final double iofPercentage = 0.06;

 public static double dollarToReal (double dolarQuantity, double dolarPrice) {
	 
	 double amountValue = dolarQuantity * dolarPrice;
	 
	 return amountValue + amountValue * iofPercentage;
 }
	
}
