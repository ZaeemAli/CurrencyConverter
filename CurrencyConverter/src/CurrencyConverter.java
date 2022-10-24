import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		HashMap<Integer, String> codes = new HashMap<Integer, String>();
		//When an integer 1-3 is entered, it retrieves the corresponding string
		codes.put(1, "USD");
		codes.put(2, "EUR");
		codes.put(3, "MXN");
		
		String initialCurrency, endCurrency;
		double amount;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("========");
		System.out.println("What currency are you converting from? (Please enter the number value)");
		System.out.print("1:USD (US Dollar), 2:EUR (Euro), 3:MXN (Mexican Peso) ");
		initialCurrency = codes.get(scanner.nextInt());
		System.out.println("=====================================================");
		
		System.out.println("Currency converting to?");
		System.out.print("1:USD (US Dollar), 2:EUR (Euro), 3:MXN (Mexican Peso) ");
		endCurrency = codes.get(scanner.nextInt());
		System.out.println("=====================================================");
		
		System.out.print("Amount you would like to convert? ");
		amount = scanner.nextFloat();
		System.out.println("=================================");
		
		if (initialCurrency.equals("USD")) {
			if (endCurrency.equals("EUR")) {
				amount *= 1.02;
			} else if (endCurrency.equals("MXN")) {
				amount *= 19.94;
			} else {
				amount += 0;
			}
		}
		if (initialCurrency.equals("EUR")) {
			if (endCurrency.equals("USD")) {
				amount *= 0.98;
			} else if (endCurrency.equals("MXN")) {
				amount *= 19.65;
			} else {
				amount += 0;
			}
		}
		if (initialCurrency.equals("MXN")) {
			if (endCurrency.equals("USD")) {
				amount *= 0.050;
			} else if (endCurrency.equals("EUR")) {
				amount *= 0.051;
			} else {
				amount += 0;
			}
		}
		System.out.println("Converted amount: " + (amount));
		
		System.out.println("Thank you!");
		

	}
		
}