package inlämningar;
import java.util.Scanner;
public class Inlämning2b {

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
				System.out.println(tal1 + " är större än " + tal2);
			} else if(tal2 > tal1) {
				System.out.println(tal2 + " är större än " + tal1);
			} else { 
				System.out.println("Talen är lika"); }
			}
			
		skanna.close();
		
	}

}
