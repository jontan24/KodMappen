package ovningar;
import java.util.Scanner;
public class Ovning24 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		
		System.out.println("Ange �garens namn");
		String namn = skanna.nextLine();
		
		System.out.println("Ange din m�nadshyra");
		int hyra = skanna.nextInt();
		
		System.out.println("Ange l�genhetens storlek i kvadratmeter");
		int storlek = skanna.nextInt();
		
		double svaret = (hyra / storlek);
		
		namn = namn.toUpperCase();
		
		System.out.println(namn + " du betalar " + svaret + " kr per kvadratmeter i m�naden");
		
		skanna.close();
				
				
		
	}
//r�tt
}
