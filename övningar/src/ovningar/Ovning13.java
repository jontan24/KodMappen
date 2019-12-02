package ovningar;
import java.util.Scanner;
public class Ovning13 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		System.out.println("Skriv ett tal");
		int tal1 = skanna.nextInt();
		System.out.println("skriv ett till tal");
		int tal2 = skanna.nextInt();
		
		System.out.println(tal1 + " + " + tal2 + " = " + (tal1 + tal2));
		System.out.println(tal1 + " - " + tal2 + " = " + (tal1 - tal2));
		System.out.println(tal1 + " * " + tal2 + " = " + (tal1 * tal2));
		System.out.println(tal1 + " / " + tal2 + " = " + ((double) tal1 / tal2));		
		
		skanna.close();
		
	}
//rätt
}
