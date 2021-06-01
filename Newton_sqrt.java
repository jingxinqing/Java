package newton_sqrt;

import java.util.Scanner;

public class Newton_sqrt {

	public static void main(String[] args) {
		double number = 1;
		double newGuess = 1;
		double lastGuess = number/2;
		double accuracy = 1;
		
		boolean invalidEntry;
		String input;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter in N for Newton: ");
				
		do { 
			invalidEntry=false;
			input = in.nextLine();
			input = input.trim();
			
			if (input.length() == 0)
				invalidEntry=true;
			for (int i=0; i < input.length(); i++){ 
				char c = input.charAt(i);
				if (c < '0' || c > '9'){
					invalidEntry=true;
					System.out.println("invalide entry, try again"); 
					} 
				}
		} while (invalidEntry);
		
		number = Integer.parseInt(input);
		
		
		
		while(accuracy >= 0.000001){
						
			newGuess = ((number/lastGuess) + lastGuess)/2;
			accuracy = Math.abs(newGuess - lastGuess);
			lastGuess = newGuess;
							
		}
		
		System.out.println("Newton(" + number + ") = " + newGuess);
		System.out.println("Math.sqrt = " + Math.sqrt(number));
		
		in.close();

	}

}
