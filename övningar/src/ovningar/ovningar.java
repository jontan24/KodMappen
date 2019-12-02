package ovningar;

import java.util.Scanner;

public class ovningar {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		String surname;
		String lastname;
		
		System.out.println("Vad heter du i förnamn?");
		surname = skanna.nextLine();
		
		System.out.println("vad heter du i efternamn?");
		lastname =skanna.nextLine();
		
		System.out.println(lastname + " " + surname);
		
		skanna.close();
	}

}
