package ovningar;
import java.util.Scanner;
public class Ovning325 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv ett namn");
		String namn = scan.nextLine();
		
		for (int i= 0; i < namn.length(); i = (i+2)) {System.out.println(namn.charAt(i));

		scan.close();
		
	}

}
}