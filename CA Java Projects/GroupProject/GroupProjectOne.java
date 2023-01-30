package GroupProject;

import java.util.Scanner;

public class GroupProjectOne {


	public static void main(String[] args) {
		
		Exchange();
		

	}

	public static void Exchange() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the total dollars you wish to exchange: ");
		double amount = scanner.nextDouble();
		
		boolean isCurrency = false;
		
		while (isCurrency == false) {
	
		System.out.println("Please enter the currency you wish to exchange to: ");
		System.out.println("Enter 1 for Yuan");
		System.out.println("Enter 2 for Rupees");
		System.out.println("Enter 3 for Shillings");
		int currencyExchange = scanner.nextInt();
		
		double yuan = 6.46;
		double rupee = 118.44;
		double shilling = 3526.96;
		
		double yuanExchange = amount * yuan;
		double rupeeExchange = amount * rupee;
		double shillingExchange = amount * shilling;
		
		if (currencyExchange == 1) {
			System.out.println("The amount of yuan is: " +  String.format("%.2f", yuanExchange));
			isCurrency = true;
			scanner.close();
			}
			else if (currencyExchange == 2) {
				System.out.println("The amount of rupees is: " +  String.format("%.2f", rupeeExchange));
				isCurrency = true;
				scanner.close();
			}
				else if (currencyExchange == 3) {
					System.out.println("The amount of shillings is: " +  String.format("%.2f", shillingExchange));
					isCurrency = true;
					scanner.close();
				}
					else {
						System.out.println("Error, please choose a correct number");
			}

	

		
	}
}
}
