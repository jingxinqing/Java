package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {

		int quarter;
		int dime;
		int nickle;
		int penny;
		int total;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the number of Quarters in the jar: ");
		quarter = in.nextInt();
		
		System.out.print("Please enter the number of Dimes in the jar: ");
		dime = in.nextInt();
		
		System.out.print("Please enter the number of Nickles in the jar: ");
		nickle = in.nextInt();
		
		System.out.print("Please enter the number of Pennies in the jar: ");
		penny = in.nextInt();
		
		total = quarter*25 + dime*10 + nickle*5 + penny;
		
		if(total < 100){
		
			System.out.println("The jar contains " + total + " cents.");
		}
		
		else{
			System.out.println("The jar contains " + total/100 + " dollars and " + total%100 + " cents.");
		}
			
	
		in.close();
		
		

	}

}
