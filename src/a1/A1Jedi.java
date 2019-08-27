package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items = scan.nextInt();
		String[] foodnames = new String[items];
		for (int i=0; i<items; i++) {
			foodnames[i] = scan.next();
			scan.nextDouble();
		}
		int customers = scan.nextInt();
		int[] quantForEachItem = new int[items];
		int[] numberOfCustPerItem = new int[items];
		for (int i=0; i<customers; i++) {
			scan.next();
			scan.next();
			int quantforCust = scan.nextInt();
			for (int j=0; j<quantforCust; j++) {
				int itemquant = scan.nextInt();
				String itemname = scan.next();
				for (int h=0; h<items; h++) {
					if (itemname.equals(foodnames[h])) {
						quantForEachItem[h] += itemquant;
						numberOfCustPerItem[h] += 1;
					}
				}
			}
		}
		scan.close();
		
		//have three arrays: one with food names in order, one with quantity of each item, one with number of customers for each item
		
		for (int i=0; i<items; i++) {
			if (numberOfCustPerItem[i] == 0) {
				System.out.println("No customers bought " + foodnames[i]);//then print "no ...."
			} else {
				System.out.println(numberOfCustPerItem[i] + " customers bought " + quantForEachItem[i] + " " + foodnames[i]);//then print number of person and name and number bought
			}
		}
		
		
	}
}
