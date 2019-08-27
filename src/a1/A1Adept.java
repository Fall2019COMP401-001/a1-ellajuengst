package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int items = scan.nextInt();
		String[] foodnames = new String[items];
		double[] foodprices = new double[items];
		for (int i=0; i<items; i++) {
			foodnames[i] = scan.next();
			foodprices[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		double[] totalsForCustomers = new double[customers];
		String[] custNames = new String[customers];
		for (int i=0; i<customers; i++) {
			custNames[i] = scan.next() + " " + scan.next();
			double total = 0;
			int purchasedItemsTotal = scan.nextInt();
			for (int j=0; j<purchasedItemsTotal; j++) {
				int itemquant = scan.nextInt();
				String itemname = scan.next();
				for (int h=0; h<items; h++) {
					double totalItemPrice = 0;
					if (itemname.equals(foodnames[h])) {
						totalItemPrice = itemquant * foodprices[h];
						total += totalItemPrice;
					}
				}
			}
			totalsForCustomers[i] = total;
			}
		
		scan.close();
		
		double biggestTotal = 0;
		String biggestName = "";
		for (int i=0; i<customers; i++) {
			if (totalsForCustomers[i]>biggestTotal) {
				biggestTotal = totalsForCustomers[i];
				biggestName = custNames[i];
			}
		}
		System.out.println("Biggest: " + biggestName + " (" + String.format("%.2f", biggestTotal) + ")");
		
		double smallestTotal = totalsForCustomers[0];
		String smallestName = "";
		for (int i=0; i<customers; i++) {
			if (totalsForCustomers[i]<=smallestTotal) {
				smallestTotal = totalsForCustomers[i];
				smallestName = custNames[i];
			}
		}
		System.out.println("Smallest: " + smallestName + " (" + String.format("%.2f", smallestTotal) + ")");
		
		double totalSpent = 0;
		double average = 0;
		for (int i=0; i<customers; i++) {
			totalSpent += totalsForCustomers[i];
			
		}
		average = totalSpent/customers;
		
		System.out.println("Average: " + "(" + String.format("%.2f", average) + ")");
	}
}
