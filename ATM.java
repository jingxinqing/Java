package atm;

import java.util.Scanner;

public class ATM {
	
	static Scanner in = new Scanner(System.in);
	
	//initial balance
	private int balance = 100;
	
	//check balance	
	public int checkBalance(){
		return balance;
	}
	
	//withdraw
	public void withdraw() {
		System.out.print("Enter the amount you want to withdraw: ");
		
		//validate input
		if(!in.hasNextInt()) {
			System.err.println("invalid input");
			in.next();
			return;			
		}
		
		//withdraw
		int amount = in.nextInt();
		if(amount > balance) {
			System.out.println("You do not have enough balance. Transaction ignored.");
			return;
		}
		else
			System.out.println(amount + " has been withdrawn from your account.");
		balance = balance - amount;
			
	}
	
	//deposit
	public void deposit() {
		System.out.print("Enter the amount you want to deposit: ");
		//validate input
		if(!in.hasNextInt()) {
			System.err.println("invalid input");
			in.next();
			return;
		}
		//deposit
		int amount = in.nextInt();
		System.out.println(amount + " has been deposited to your account.");
		balance = balance + amount;
		
	}
	
	public static void main(String[] args) {
		//instance
		ATM atmObject = new ATM();
		
		String option = "";
		do {
			// display main menu
			System.out.println("Main menu:");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.print("Enter a choice: ");
		
			//user input
			option = in.next();
		
			//validate user input
			while(!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4") ) {
				System.err.print(option + " is not an option, please re-enter: ");
				option = in.next();
			}
		
			//operations			
			switch(option) {
				case "1":
					System.out.println("You have " + atmObject.checkBalance() + " in your account." );
					break;
				case "2":
					atmObject.withdraw();
					break;
				case "3":
					atmObject.deposit();
					break;
				case "4":
					System.out.println("Have a nice day!");
					break;
							
				}
						
			
			
			
		}while(!option.equals("4"));
				
	}

}


