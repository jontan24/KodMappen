package ovningar;
import java.util.Scanner;
public class Ovning38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv ett heltal");
		int tal1 = scan.nextInt();
		System.out.println("Skriv ett till tal");
		int tal2 = scan.nextInt();
		
		if (tal1 > tal2) { System.out.println(tal1 + " �r st�rre �n " + tal2);}
		else if (tal2 > tal1) { System.out.println(tal2 + " �r st�rre �n " + tal1);}
		else {System.out.println("talen �r lika");
		}
	}

}
