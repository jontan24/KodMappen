package inlämningar;

import java.util.Scanner;

public class Inlämning2 {

	public static void main(String[] args) {
		
		Scanner skanna = new Scanner(System.in);
	
		System.out.println("Skriv ett tal");
		int tal1 = skanna.nextInt();
			
		System.out.println("Skriv ett till tal");
		int tal2 = skanna.nextInt();
	
		if(tal1 > tal2) { 
			System.out.println(tal1 + " är större än " + tal2);
		} else if(tal2 > tal1) {
			System.out.println(tal2 + " är större än " + tal1);
		} else { 
			System.out.println("Talen är lika"); 
		}

		skanna.close();

	}

}
