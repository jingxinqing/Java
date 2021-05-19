package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		int dollarPrice;
		int centPrice;
		int dollarIn;
		int centIn;
		int dollarChange;
		int quarterChange;
		int dimeChange;
		int nickleChange;
		int pennyChange;
		int change;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter price dollars: ");
		dollarPrice = in.nextInt();
		
		System.out.print("Enter price cents: ");
		centPrice = in.nextInt();
		
		System.out.print("Enter money received dollars: ");
		dollarIn = in.nextInt();
		
		System.out.print("Enter money received cents: ");
		centIn = in.nextInt();
		
		change = dollarIn*100 + centIn - dollarPrice*100 - centPrice;
		
		dollarChange = change/100;
		quarterChange = change%100/25;
		dimeChange = change%100%25/10;
		nickleChange = change%100%25%10/5;
		pennyChange = change%100%25%10%5;
		
		System.out.println("Change returned: ");
		System.out.println(dollarChange + " dollar(s)");
		System.out.println(quarterChange + " quarter(s)");
		System.out.println(dimeChange + " dime(s)");
		System.out.println(nickleChange + " nickle(s)");
		System.out.println(pennyChange + " pennies");
		
		in.close();


		

	}

}
