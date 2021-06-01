package string_methods;

import java.util.Scanner;

public class MyStringMethods {
	
	private String myStr="";
	
	public void readString(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		myStr = in.nextLine();
		in.close();
	}

	public void setString(String s){
		myStr = s;
	}
	
	public int countOccurrences(String s){
		
		int index = myStr.indexOf(s);
		int count = 0;
		while(index>=0 && myStr.length()>0){
			index=myStr.indexOf(s, index+1);
			count++;
		}
		
		return count;
	}
	
	
	public int countOccurrences(char c){
		
		int index = myStr.indexOf(c);
		int count = 0;
		while(index>=0 && myStr.length()>0){
			index=myStr.indexOf(c, index+1);
			count++;
		}
		
		return count;
		
	}
	
	int countUpperCaseLetters(){
		
		int count=0;
		
		for(int i=0; i<myStr.length(); i++){
			if(Character.isUpperCase(myStr.charAt(i))){
				count++;
		}

	}
		return count;
	}
	
	int countLowerCaseLetters(){

		int count=0;
		
		for(int i=0; i<myStr.length(); i++){
			if(Character.isLowerCase(myStr.charAt(i))){
				count++;
		}

	}
		return count;
		
	}
	
	
	public void printCounts(String s, char c){
		
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr="+myStr);
		System.out.println("Number of Upper case letters="+countUpperCaseLetters());
		System.out.println("Number of Lower case letters="+countLowerCaseLetters());
		System.out.println("Number of "+s + " is "+ countOccurrences(s));
		System.out.println("Number of "+c + " is "+ countOccurrences(c));
		
	}
	
	
	public static void main(String[] args) {
		MyStringMethods msm = new MyStringMethods();
		msm.readString();
		msm.printCounts("big", 'a');
		
		msm.setString("Parked in a van down by the river bank .... The van evan  vanished  near a lot of other vans");
		msm.printCounts("van", 'a');
		
		MyStringMethods msm2 = new MyStringMethods();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
		
	}

}