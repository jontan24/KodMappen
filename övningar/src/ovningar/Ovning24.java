package ovningar;
import java.util.Scanner;
public class Ovning24 {

	public static void main(String[] args) {
		Scanner skanna = new Scanner(System.in);
		
		System.out.println("Ange ägarens namn");
		String namn = skanna.nextLine();
		
		System.out.println("Ange din månadshyra");
		int hyra = skanna.nextInt();
		
		System.out.println("Ange lägenhetens storlek i kvadratmeter");
		int storlek = skanna.nextInt();
		
		double svaret = (hyra / storlek);
		
		namn = namn.toUpperCase();
		
		System.out.println(namn + " du betalar " + svaret + " kr per kvadratmeter i månaden");
		
		skanna.close();
				
				
		
	}
//rätt
}
