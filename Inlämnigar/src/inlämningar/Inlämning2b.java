package inl�mningar;
import java.util.Scanner;
public class Inl�mning2b {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		
		int tal1 = 1;
		
		while(tal1 != 0) {
		
			System.out.println("Skriv ett tal");
			tal1 = skanna.nextInt();
		
			if (tal1 == 0) {
				System.out.println("Tackar.");
			} else if (tal1 != 0) {
				System.out.println("Skriv ett till tal");
			}
			
			int tal2 = skanna.nextInt();
		
			if(tal1 > tal2){ 
				System.out.println(tal1 + " �r st�rre �n " + tal2);
			} else if(tal2 > tal1) {
				System.out.println(tal2 + " �r st�rre �n " + tal1);
			} else { 
				System.out.println("Talen �r lika"); }
			}
			
		skanna.close();
		
	}

}
