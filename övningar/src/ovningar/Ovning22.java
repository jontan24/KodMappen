package ovningar;
import java.util.Scanner;
public class Ovning22 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		
		System.out.println("Skriv in ett namn");
		String namn = skanna.nextLine();
		
		int lengd = namn.length();
		
		System.out.println(namn + "," + " det är " + lengd + " tecken i namnet");
		
		skanna.close();
		

	}

}//rätt
