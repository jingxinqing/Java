package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input;
				
		do{
		
		System.out.print("Enter in N: ");
		int number = in.nextInt();
		
		long factorial = 1;
		
		while(number>=1){
			
			factorial = factorial*number;
			number--;
							
		}
		
		System.out.println("factorial = " + factorial);
		
		System.out.print("Do you want to continue? (y/n): ");
		input = in.next();
		System.out.println();
	
		}while(input.equals("y"));
		
		System.out.println("Have a good day!");
		System.out.println();
		
		in.close();
	}

}
