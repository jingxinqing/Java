package gas_mileage;

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		double gas;
		double distance;
		double mpg;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter gallsons of gas used: ");
		gas = in.nextDouble();
		
		System.out.print("Please enter the distance: ");
		distance = in.nextDouble();
		
		mpg = distance/gas;
		System.out.print("Miles per gallon for your vehicle is: ");
		System.out.printf("%.2f", mpg);
		
		in.close();
		
	}
	
	
	
	

}
