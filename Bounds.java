package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		int startingNumber;
		int upperBound;
		int stepSize;
		
		System.out.print("Please enter starting number: ");
		startingNumber = in.nextInt();
		System.out.print("Please enter upper bound: ");
		upperBound = in.nextInt();
		System.out.print("Please enter step size: ");
		stepSize = in.nextInt();
		
		System.out.println("You entered: "+ startingNumber + ", " + upperBound + ", " + stepSize);
		
		System.out.println("The output is:");
		
		while(startingNumber < upperBound){
				for(int i=0; i<10; i++){
					if(startingNumber < upperBound){
						System.out.print(startingNumber + " ");
						startingNumber = startingNumber + stepSize;
						
					}
				
				}
				System.out.println();
		}
		
		in.close();	
	}
	
}

		