package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		
		char letter = 'a';
		
			
		while(letter <= 'z'){
											
			switch (letter){	
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
				System.out.println(letter + " is a vowel.");
				break;
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'z':
				System.out.println(letter + " is a consonant.");
				break;
				
			}
			letter += 1;
		}
	}
}