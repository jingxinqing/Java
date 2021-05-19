package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double tempC = 0.0;
		double totalC = 0.0;
		double tempF = 0.0;
		double totalF = 0.0;
		double averageC = 0.0;
		double averageF = 0.0;
		
		int count = 0;
		
		System.out.print("Enter temperature in Centigrade or <= -100 to quit: ");
		tempC = in.nextInt();
		
		while (tempC>-100.0){
			
			tempF = (9.0/5.0)*tempC + 32.0;
			System.out.println("Temperature: F(" + tempF +")" + "C(" + tempC + ")");
			
			count++;
			
			totalC = totalC + tempC;
			totalF = tempF + totalF;
			
			System.out.print("Enter temperature in Centigrade or <= -100 to quit: ");
			tempC = in.nextInt();
			
		}
		
		
		averageC = totalC/count;
		averageF = totalF/count;
		System.out.println("Average: Centigrade (" + averageC + ")");
		System.out.println("Average: Fahrenheit (" + averageF + ")");
		
		in.close();
	}
	
}


