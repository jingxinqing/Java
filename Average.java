package averager;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		int integer1;
		int integer2;
		int integer3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the first integer: ");
		integer1 = in.nextInt();
		
		System.out.print("Please enter the second integer: ");
		integer2 = in.nextInt();
		
		System.out.print("Please enter the third integer: ");
		integer3 = in.nextInt();
		
		System.out.println("You entered: " + integer1 + ", " + integer2 + ", " + integer3);
		System.out.println("The average is: " + (integer1+integer2+integer3)/3);

	}

}
