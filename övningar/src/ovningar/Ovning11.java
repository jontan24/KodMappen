package ovningar;
import java.util.Scanner;
public class Ovning11 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		final int pensions�ldern = 65;
		int myage;
		
		
		System.out.println("hur gammal �r du?");
		myage = skanna.nextInt();
		
		myage = pensions�ldern - myage;
		
		System.out.println("Du g�r i pension om " + myage + " " + "�r");
		
		
		skanna.close();
	}
//r�tt
}
