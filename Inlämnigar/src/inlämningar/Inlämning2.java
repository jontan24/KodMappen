package inl�mningar;

import java.util.Scanner;

public class Inl�mning2 {

	public static void main(String[] args) {
		
		Scanner skanna = new Scanner(System.in);
	
		System.out.println("Skriv ett tal");
		int tal1 = skanna.nextInt();
			
		System.out.println("Skriv ett till tal");
		int tal2 = skanna.nextInt();
	
		if(tal1 > tal2) { 
			System.out.println(tal1 + " �r st�rre �n " + tal2);
		} else if(tal2 > tal1) {
			System.out.println(tal2 + " �r st�rre �n " + tal1);
		} else { 
			System.out.println("Talen �r lika"); 
		}

		skanna.close();

	}

}
