package ovningar;
import java.util.Scanner;
public class Ovning11 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		final int pensionsåldern = 65;
		int myage;
		
		
		System.out.println("hur gammal är du?");
		myage = skanna.nextInt();
		
		myage = pensionsåldern - myage;
		
		System.out.println("Du går i pension om " + myage + " " + "år");
		
		
		skanna.close();
	}
//rätt
}
