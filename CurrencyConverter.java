package Currency;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
    	Customer customer = new Customer("Oliver", 100.0);
        double usdToCad = 1.27;
        


        try (
		Scanner scanner = new Scanner(System.in)) {
        	System.out.println("Customer name: " + customer.getName());
			System.out.print("Enter the amount in USD: ");
			double usdAmount = scanner.nextDouble();

			
			double cadAmount = usdAmount * usdToCad;
			

			
			System.out.println("Amount in CAD: " + cadAmount);
			
		}
    }
}
