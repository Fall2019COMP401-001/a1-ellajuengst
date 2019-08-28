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
			String name = scan.next() + " " + scan.next();
			int quantforCust = scan.nextInt();
			int[] custsItemsNumbers = new int[items];
			for (int j=0; j<quantforCust; j++) {
				int itemquant = scan.nextInt();
				String itemname = scan.next();
				for (int h=0; h<items; h++) {
					if (itemname.equals(foodnames[h])) {
						quantForEachItem[h] += itemquant;
						custsItemsNumbers [h] += 1;
					}

				}
				
			}
			for (int h=0; h<items; h++) {
				if (custsItemsNumbers [h]>= 1) {
					numberOfCustPerItem[h] +=1;
				}
			}
		}	
		
	scan.close();
		
	
		
		for (int p=0; p<items; p++) {
			if (numberOfCustPerItem[p] == 0) {
				System.out.println("No customers bought " + foodnames[p]);
			} else {
				System.out.println(numberOfCustPerItem[p] + " customers bought " + quantForEachItem[p] + " " + foodnames[p]);
			}
		}
		
		
	}
	}


	/* static int didTheyBuy(String name, String[] foods, int quant) {
		for (int j=0; j<quant; j++) {
			if (name.equals(foods[j])) {
				return 1;
			} 
		}
		return 0;
	}*/

