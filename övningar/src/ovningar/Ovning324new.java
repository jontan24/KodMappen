package ovningar;
import java.util.Scanner;
public class Ovning324new {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv valfritt ord");
		String ord = scan.nextLine();
		int count = 0;
		for(int i=0; i < ord.length(); i++) {
			if (ord.charAt(i) != 'a') 
				count++;}
				
		System.out.print("A förekommer " + count + " gånger");
		}
	}


