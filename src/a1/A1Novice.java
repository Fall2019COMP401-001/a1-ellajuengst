package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int count = scan.nextInt();
		
		
		for (int i=0; i<count; i++) {
			String first = scan.next();
			String last = scan.next();
			double total = 0;
			int quant = scan.nextInt();
			for (int j=0; j<quant; j++) {
				int itemquant = scan.nextInt();
				scan.next();
				double itemprice = scan.nextDouble();
				double totprice = itemquant * itemprice;
				total += totprice;
			}
			String firstinitial = first.substring(0,1);
			System.out.println(firstinitial + ". " + last + " " + String.format("%.2f", total));
		}
		
	
		
		
		scan.close();
		
		
	}
}
