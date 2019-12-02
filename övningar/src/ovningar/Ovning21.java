package ovningar;
import java.util.Scanner;
public class Ovning21 {

	public static void main(String[] args) {
		
			Scanner skanna = new Scanner(System.in);

				System.out.println("Vad är ditt förnamn?");
				String surname = skanna.nextLine();

				System.out.println("Vad är ditt efternamn?");
				String lastname = skanna.nextLine();

				System.out.println(surname + " , " + lastname );

				skanna.close();
	}

}//rätt
